package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.ProfileBO;

@Repository("profileDAO")
public class FBProfileDAOImpl implements FBProfileDAO {
	private static final String GET_FB_PROFILES="SELECT PROFILE_ID,PROFILE_NAME,EMAIL,FOLLOWERS,NUMBER_FRIENDS FROM FACEBOOK_PROFILE";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<ProfileBO> getAllProfiles() {
	List<ProfileBO> listBO=null;
	listBO=jt.query(GET_FB_PROFILES,rs->{
		List<ProfileBO> listBOs=null;
		ProfileBO bo=null;
		listBOs=new ArrayList();
		while(rs.next()){
		 bo=new ProfileBO();
		 bo.setProfiledId(rs.getInt(1));
		 bo.setProfileName(rs.getString(2));
		 bo.setEmail(rs.getString(3));
		 bo.setFollowers(rs.getInt(4));
		 bo.setFriends(rs.getInt(5));
		 listBOs.add(bo);	
		}
		System.out.println("FBDAO:"+jt.getDataSource().getClass());
		return listBOs;
	});
	return listBO;
   }
}
