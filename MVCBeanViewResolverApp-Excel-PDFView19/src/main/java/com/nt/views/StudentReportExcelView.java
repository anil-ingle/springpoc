package com.nt.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class StudentReportExcelView extends AbstractXlsView {

	@Override
	public void buildExcelDocument(Map<String, Object> map, Workbook book, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<String> studList=null;
		Sheet sheet=null;
		Row row=null;
		int i=0;
		res.setContentType("application/vnd.ms-excel");
		//get Model Attritute
		studList=(List<String>) map.get("stList");
		
		//construct excel sheet
		 sheet=book.createSheet("Sheet1");
		 
		//create first row on a created spreadsheet
		row=sheet.createRow(0);
	 //create first cell on created row
     for(String name:studList){
    	
   	 row=sheet.createRow(i);
	  row.createCell(0).setCellValue(name);
	  i++;
     }
			
	


	}

}
