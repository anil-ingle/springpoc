package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	
	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}//method
	
	
/*	@Override
	public EmployeeBO getEmpDetailsByNo(int no) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO,
		                  (ResultSet rs, int index) -> {
		                	EmployeeBO ebo=null;
		                	ebo=new EmployeeBO();
		                	//copy record from ResultSet obj to Bo class object
		                	ebo.setEno(rs.getInt(1));
		                	ebo.setEname(rs.getString(2));
		                	ebo.setDesg(rs.getString(3));
		                	ebo.setSalary(rs.getInt(4));
		                	return ebo;
		                }//mapRow
			          ,
		              no
		            );
		return bo;
	}//method
	
	
	@Override
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {
		List<EmployeeBO>  listBO=null; 
		 listBO=jt.query(GET_EMP_DETAILS_BY_DESG,
				        	(ResultSet rs)->{
								  List<EmployeeBO> listEBO=null;
								  EmployeeBO bo=null;
								  listEBO=new ArrayList<>();
								  while(rs.next()){
									  bo=new EmployeeBO();
									  bo.setEno(rs.getInt(1));
									  bo.setEname(rs.getString(2));
									  bo.setDesg(rs.getString(3));
									  bo.setSalary(rs.getInt(4));
									  listEBO.add(bo);
								  }//while
								return listEBO;
							}//extractData(-)
				        	,
				        desg);
		return listBO;
	}
*/
	
/*	@Override
	public EmployeeBO getEmpDetailsByNo(int no) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO,
		            new RowMapper<EmployeeBO>(){
		                @Override
		                public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
		                	EmployeeBO bo=null;
		                	bo=new EmployeeBO();
		                	//copy record from ResultSet obj to Bo class object
		                	bo.setEno(rs.getInt(1));
		                	bo.setEname(rs.getString(2));
		                	bo.setDesg(rs.getString(3));
		                	bo.setSalary(rs.getInt(4));
		                	return bo;
		                }//mapRow
			
	                   }// anonymous inner class
		              ,
		              no
		            );
		return bo;
	}//method
	
	
	@Override
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {
		List<EmployeeBO>  listBO=null; 
		 listBO=jt.query(GET_EMP_DETAILS_BY_DESG,
				        new ResultSetExtractor<List<EmployeeBO>>(){

							@Override
							public List<EmployeeBO> extractData(ResultSet rs)
									throws SQLException, DataAccessException {
								  List<EmployeeBO> listBO=null;
								  EmployeeBO bo=null;
								  listBO=new ArrayList<>();
								  while(rs.next()){
									  bo=new EmployeeBO();
									  bo.setEno(rs.getInt(1));
									  bo.setEname(rs.getString(2));
									  bo.setDesg(rs.getString(3));
									  bo.setSalary(rs.getInt(4));
									  listBO.add(bo);
								  }//while
								return listBO;
							}//extractData(-)
		                 }//Anonymous inner class
	                    ,	 
				        desg);
		return listBO;
	}
	
*/

	@Override
	public EmployeeBO getEmpDetailsByNo(int no) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_DETAILS_BY_NO,new EmployeeRowMapper(),no);
		return bo;
	}//method
	
	private class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		@Override
		public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			 EmployeeBO bo=null;
			//copy ResultSet Object record EmployeeBO class object
			bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		}//method
	}//inner class
	
	/* private List<EmployeeBO> listBO=new ArrayList();
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {

		 jt.query(GET_EMP_DETAILS_BY_DESG,new EmployeeRowCallbackHandler(),desg);
		return listBO;
	}
	
	
	private class EmployeeRowCallbackHandler implements RowCallbackHandler{
		
           @Override
        public void processRow(ResultSet rs) throws SQLException {
        	   System.out.println("processRow(-)");
        	   EmployeeBO bo=null;
        	   bo=new EmployeeBO();
        	   bo.setEno(rs.getInt(1));
        	   bo.setEname(rs.getString(2));
        	   bo.setDesg(rs.getString(3));
        	   bo.setSalary(rs.getInt(4));
        	   listBO.add(bo);
        }
	
	}///inner class
*/
	
	
	@Override
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {
		List<EmployeeBO>  listBO=null;
 
		 listBO=jt.query(GET_EMP_DETAILS_BY_DESG,new EmployeeExtractor(),desg);
		return listBO;
	}
	
	
	private class EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{
		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			System.out.println("extractData(-)");
			List<EmployeeBO> listBO=null;
			EmployeeBO bo=null;
			//copy ResultSEt object records to List Collection
			listBO=new ArrayList();
			while(rs.next()){
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listBO.add(bo);
			}//while
			return listBO;
		}//method
	}///inner class
	
	
}//outer class
