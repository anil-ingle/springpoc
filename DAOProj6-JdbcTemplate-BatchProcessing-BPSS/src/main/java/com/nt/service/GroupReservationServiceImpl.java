package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.PassengerBO;
import com.nt.dao.GroupReservationDAO;
import com.nt.dto.PassengerDTO;

public class GroupReservationServiceImpl implements GroupReservationService {
	private GroupReservationDAO dao;

	public void setDao(GroupReservationDAO dao) {
		this.dao = dao;
	}

	@Override
	public String groupReservation(List<PassengerDTO> listDTO) {
		List<PassengerBO> listBO=null;
		PassengerBO bo=null;
		int result[]=null;
		//convert ListDTO to ListBO
		listBO=new ArrayList<>();
		for(PassengerDTO dto:listDTO){
			bo=new PassengerBO();
			BeanUtils.copyProperties(dto, bo);
			listBO.add(bo);
		}//for
		//use DAO
		result=dao.bulkInsert(listBO);
		if(result!=null)
			return "Group Reservation is done";
		else
			return "Group Reservation is not done";
	}//method
}//class
