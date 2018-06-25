package com.nt.aspect;

import org.springframework.beans.BeanUtils;

import com.nt.bo.UserDetailsBO;
import com.nt.dao.AuthenticateDAO;
import com.nt.dto.UserDetailsDTO;

public class AuthenticationManager {
	private AuthenticateDAO dao=null;
	private ThreadLocal<UserDetailsDTO> threadLocal=new ThreadLocal();

	public void setDao(AuthenticateDAO dao) {
		this.dao = dao;
	}
	
	public void singIn(String user,String pwd){
		UserDetailsDTO detailsDTO=null;
		//create UserDetailsDTO obj having username,password
		detailsDTO=new UserDetailsDTO();
		detailsDTO.setUserName(user);
		detailsDTO.setPassword(pwd);
		//add to ThreadLocal
		threadLocal.set(detailsDTO);
	}//method
	
	public void signOut(){
	   threadLocal.remove();
	}
	
	public boolean isAuthenticated(){
		UserDetailsDTO dto=null;
		UserDetailsBO bo=null;
		int count=0;
		//get the username,password of current thread
		dto=threadLocal.get();
		//convert dto to BO
		bo=new UserDetailsBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.authenticate(bo);
		if(count==0)
			return false;
		else
			return true;
	}//method
	

}
