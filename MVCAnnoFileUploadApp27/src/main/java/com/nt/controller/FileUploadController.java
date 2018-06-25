package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.RegisterCommand;

@Controller
public class FileUploadController {

	@RequestMapping(value="/register.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("regCmd")RegisterCommand cmd){
		
		return "register";
		
	}
	
	@RequestMapping(value="/register.htm",method=RequestMethod.POST)
	public String processForm(Map<String,Object> map,@ModelAttribute("regCmd")RegisterCommand cmd)throws Exception{
		InputStream is1=null,is2=null;
		String fname1=null,fname2=null;
		File destFile1=null,destFile2=null;
		File destDir=null;
		OutputStream os1=null,os2=null;
		//Get Input Streams from Command obj properties
		is1=cmd.getFile1().getInputStream();
		is2=cmd.getFile2().getInputStream();
		//get Uploded file names
		fname1=cmd.getFile1().getOriginalFilename();
		fname2=cmd.getFile2().getOriginalFilename();
		//create output Stream pointing Dest files on Server machine filesytem
		destDir=new File("E:/springuploads");
		if(!destDir.exists()){
			destDir.mkdirs();
		}
		destFile1=new File(destDir.getAbsolutePath()+"/"+fname1);
		destFile2=new File(destDir.getAbsolutePath()+"/"+fname2);
		os1=new FileOutputStream(destFile1);
		os2=new FileOutputStream(destFile2);
		//Complete file Uploading
		IOUtils.copy(is1, os1);
		IOUtils.copy(is2, os2);
		//close stream
		is1.close(); os1.close();
		is2.close(); os2.close();
		//add uploaded file names to Model attributes
		map.put("file1",fname1);
		map.put("file2",fname2);
		
		//retirn LVN
		return "result";
		
		
	}
}
