package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmployeeSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	@Autowired
	private EmployeeSearchDAO dao;


	public List<SearchResultDTO> findEmployees(SearchDTO dto) {
		SearchBO bo=null;
		List<SearchResultBO> listRBO=null;
		List<SearchResultDTO> listRDTO=null;
		SearchResultDTO RDTO=null;
		//Convert DTO class obj BO class object
		bo=new SearchBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		listRBO=dao.searchEmps(bo);
		//Covert listRBO to listRDTO
		listRDTO=new ArrayList();
		for(SearchResultBO RBO:listRBO){
			RDTO=new SearchResultDTO();
			BeanUtils.copyProperties(RBO,RDTO);
			listRDTO.add(RDTO);
		}//for
		return listRDTO;
	}//findEmployees()
}//class
