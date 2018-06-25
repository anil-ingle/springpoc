package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.ProfileBO;
import com.nt.dao.FBProfileDAO;
import com.nt.dto.ProfileDTO;

@Service("profileService")
public class FBProfileServiceImpl implements FBProfileService {
	@Autowired
   private FBProfileDAO dao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,transactionManager="dsTxMgmr")
	public List<ProfileDTO> fetchAllProfiles() {
	   List<ProfileBO> listBO=null;
	   final List<ProfileDTO> listDTO=new ArrayList();
	  
	   
	   //get All Profiles
	   listBO=dao.getAllProfiles();
	   //copy ListBO to ListDTO
	   listBO.forEach(bo->{
		 ProfileDTO dto=null;
		   dto=new ProfileDTO();
		   BeanUtils.copyProperties(bo,dto);
		   listDTO.add(dto);
	   });
		return listDTO;
	}//method

}//class
