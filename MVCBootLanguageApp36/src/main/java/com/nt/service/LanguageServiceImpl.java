package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Override
	public List<String> getLanguages() {
		List<String> langList=null;
		Locale locales[]=null;
		//get all available Locales
		locales=Locale.getAvailableLocales();
		langList=new ArrayList();
		for(Locale loc:locales){
			langList.add(loc.getDisplayLanguage());
		}
		return langList;
	}

}
