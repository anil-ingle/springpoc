package com.nt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListUploadedFilesSeviceImpl implements ListUploadedFileService {
   private static final String UPLOAD_BASE_DIR="E:/Springuploads";
   
	@Override
	public List<String> listAllFiles() {
	     File uploadFolder=null;
	     File files[]=null;
	     List<String> filesList=null;
	     
	     //locate Upload folder
	     uploadFolder=new File(UPLOAD_BASE_DIR);
	     //get All files and folders of Upload folder
	     files=uploadFolder.listFiles();
	     //process the files[]
	     filesList=new ArrayList();
	     for(File file:files){
	    	 if(!file.isDirectory()){
	    		 filesList.add(file.getName());
	    	 }//if
	     }//for

		return filesList;
	}//listAllFiles
}//class
