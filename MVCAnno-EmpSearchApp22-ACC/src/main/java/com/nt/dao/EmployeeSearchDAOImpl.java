package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

@Repository("empDAO")
public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
  private static final String EMP_SEARCH_QUERY=" SELECT  EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO=?) OR"
  		+ "                                      (ENAME IS NOT NULL AND ENAME=?) "
  		+ "                                       OR (JOB IS NOT NULL AND  JOB=?)"
  		+ "                                       OR (SAL IS NOT NULL AND SAL=?)";
  

    @Autowired
	private JdbcTemplate jt;
	
    
	public List<SearchResultBO> searchEmps(SearchBO bo) {
	  List<SearchResultBO> listRBO=null;
	  listRBO=jt.query(EMP_SEARCH_QUERY,new SearchExtractor(),
			           bo.getEno(),bo.getEname(),bo.getJob(),bo.getSalary());
		return listRBO;
	}//method
	
	private class SearchExtractor implements ResultSetExtractor<List<SearchResultBO>>{

		public List<SearchResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<SearchResultBO> listRBO=null;
			SearchResultBO RBO=null;
			listRBO=new ArrayList();
			while(rs.next()){
			 RBO=new SearchResultBO();
			 RBO.setEno(rs.getInt(1));
			 RBO.setEname(rs.getString(2));
			 RBO.setJob(rs.getString(3));
			 RBO.setSalary(rs.getInt(4));
			 RBO.setDeptno(rs.getInt(5));
			 RBO.setMgrNo(rs.getInt(6));
			 listRBO.add(RBO);
			}//while
			return listRBO;
		}//extractData(-)
	}//inner class
}//outer class
