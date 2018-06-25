package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.service.ListUploadedFileService;

@Controller
public class FileDonwloadController {
  private static final String UPLOAD_BASE_DIR="E:/springuploads";
	@Autowired
	private ListUploadedFileService service;

	@RequestMapping(value="/home.htm")
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping(value="/list_files.htm")
	public  void showUploadFiles(Map<String,Object> map){
		List<String> filesList=null;
		//use Service
		filesList=service.listAllFiles();
		//add this info to Model Attribute
		map.put("filesList",filesList);
	}
	

	@RequestMapping(value="/download.htm")
	public   String  download(@RequestParam("file_name")String fname,
			                  HttpServletRequest req,
			                  HttpServletResponse res)throws Exception{
		System.out.println("filename::"+fname);
		 File file=null;
		 InputStream is=null;
		 OutputStream os=null;
		 //make browser to make recived content as downloadable file
		 res.addHeader("Content-Disposition","attachment;fileName="+fname);
		//Locate file
		 file=new File(UPLOAD_BASE_DIR+"/"+fname);
		 //get File MIME type and set it as response content type
		 res.setContentType(req.getServletContext().getMimeType(file.getAbsolutePath()));
		 //take file length as response content legnth
		 res.setContentLength((int)file.length());
		 //create InputStream pointing to the file to be downloaded
		 is=new FileInputStream(file);
		 //create OuputStream pointing to the response objs
		 os=res.getOutputStream();
		 //wrtie File content to response obj
		 IOUtils.copy(is,os);
		 
		 //flush the response
		 res.flushBuffer();
		 //close stream
		 is.close(); os.close();
		return null;
	}//method
}//class
