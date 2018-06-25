package com.nt.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.nt.domain.EmployeeHLO;


public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String HQL_GET_EMPS="from EmployeeHLO";
	private static final String HQL_UPDATE_EMAIL_BY_NO="update EmployeeHLO set email=? where eid=?";
	private static final String HQL_DELETE_EMPS_BY_LASTNAME="delete from EmployeeHLO where lastName=:lname";
	private static  final String HQL_GET_EMPS_BY_EMAIL_DOMAIN="from EmployeeHLO where email like :dmn";
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int insert(EmployeeHLO hlo) {
		int idVal=0;
		//save object
		 idVal=(int) ht.save(hlo);
		 return idVal;
	}
	
	@Override
	public List<EmployeeHLO> getAllEmployees() {
		List<EmployeeHLO> listHLO;
		listHLO= (List<EmployeeHLO>) ht.find(HQL_GET_EMPS);
		return listHLO;
	}
	
	@Override
	public int updateEmployeeEmail(int eid, String newEmail) {
		return ht.bulkUpdate(HQL_UPDATE_EMAIL_BY_NO, newEmail,eid);
	}
	
	@Override
	public int deleteEmployeeByLastName(String surName) {
		int count=0;
		//count=ht.execute(new MyHibernateCallback(surName));
	/*	count=ht.execute(new HibernateCallback<Integer>() {
			@Override
			public Integer doInHibernate(Session ses) throws HibernateException {
				Query query=null;
				int count=0;
				//create Query object
				query=ses.createQuery(HQL_DELETE_EMPS_BY_LASTNAME);
				//set param values
				query.setParameter("lname",surName);
				count=query.executeUpdate();
				return count;
			}
		}); */
		count=ht.execute(ses->{
			Query query=null;
			int cnt=0;
			//create Query object
			query=ses.createQuery(HQL_DELETE_EMPS_BY_LASTNAME);
			//set param values
			query.setParameter("lname",surName);
			cnt=query.executeUpdate();
			return cnt;
		});
		
		
		return count;
	}//method
	
	@Override
	public List<EmployeeHLO> getEmployeesByEmailDomain(String domain) {
		 List<EmployeeHLO> listHLO=null;
		 listHLO=(List<EmployeeHLO>) ht.findByNamedParam(HQL_GET_EMPS_BY_EMAIL_DOMAIN, "dmn","%"+domain);
		return listHLO;
	}
	
	@Override
	public List<EmployeeHLO> getEmployeesByLastName(String surName1, String surName2, String surName3) {
		List<EmployeeHLO> listHLO=null;
		//get Access to Named HQL Query
		listHLO=(List<EmployeeHLO>) ht.findByNamedQueryAndNamedParam("GET_EMP_DETAILS_BY_LNAME", 
				                             new String[]{"surname1","surname2","surname3"},
				                             new String[]{surName1,surName2,surName3});        
		return listHLO;
	}
	
/*	private class MyHibernateCallback implements HibernateCallback<Integer>{
		 private String surname;
		 
		 public MyHibernateCallback(String surName){
			 this.surname=surName;
		 }

		@Override
		public Integer doInHibernate(Session ses) throws HibernateException {
			Query query=null;
			int count=0;
			//create Query object
			query=ses.createQuery(HQL_DELETE_EMPS_BY_LASTNAME);
			//set param values
			query.setParameter("lname",surname);
			count=query.executeUpdate();
			return count;
		}//method
		
	}//inner class */

}
