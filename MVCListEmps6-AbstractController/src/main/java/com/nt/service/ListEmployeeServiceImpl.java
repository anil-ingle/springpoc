package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class ListEmployeeServiceImpl implements ListEmployeeService {
 private ListEmployeeDAO dao;
 
public void setDao(ListEmployeeDAO dao) {
	this.dao = dao;
}

  @Override
  public List<EmployeeDTO> getAllEmployess() {
   List<EmployeeBO> listEmpBO=null;
   List<EmployeeDTO> listEmpDTO=null;
   EmployeeDTO dto=null;
   
 	//use DAO
    listEmpBO=dao.retriveAllEmps();
    //Convert ListEmpBO to ListEmpDTO
    listEmpDTO=new ArrayList();
    for(EmployeeBO bo:listEmpBO){
    	dto=new EmployeeDTO();
    	BeanUtils.copyProperties(bo, dto);
    	listEmpDTO.add(dto);
    }
	  System.out.println("service class"+listEmpDTO.size());
		return listEmpDTO;
  }

}
