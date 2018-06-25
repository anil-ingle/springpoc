package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.EmployeeBO;

public class ListEmployeeDAOImpl implements ListEmployeeDAO {
   private static final String GET_EMP_ALL_EMPS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	private  JdbcTemplate jt;
  
  public void setJt(JdbcTemplate jt) {
	this.jt = jt;
  }

	@Override
	public List<EmployeeBO> retriveAllEmps() {
		List<EmployeeBO> listEmpBO=null;
		listEmpBO=jt.query(GET_EMP_ALL_EMPS, new EmpExtractor());
        System.out.println("DAO class"+listEmpBO.size());		
		return listEmpBO;
	}
	
	private class EmpExtractor implements ResultSetExtractor <List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 EmployeeBO bo=null;
			 List<EmployeeBO> listBO=null;

			 listBO=new ArrayList();
			 while(rs.next()){
			//copy each record of ResultSet obj to one BO class object
				 bo=new EmployeeBO();
				 bo.setEno(rs.getInt(1));
				 bo.setEname(rs.getString(2));
				 bo.setJob(rs.getString(3));
				 bo.setSalary(rs.getInt(4));
			 //add Each BO class obj to List Collection
				 listBO.add(bo);
			 }//while
			return listBO;
		}//extractData
		
	}//inner class

}//outer
