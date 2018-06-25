package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String REGISTER_EMP="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final String GET_EMP_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL fROM EMP WHERE JOB=?";
	private static final String GET_EMP_SALARY_BY_NO="SELECT SAL FROM EMP  WHERE EMPNO=?";
	private static final String UPDATE_EMP_SALARY_BY_NO="UPDATE EMP SET SAL=? where EMPNO=?";
	private static final String DELETE_EMP_BY_NO="DELETE EMP WHERE EMPNO=?";
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(int empno, String ename, int salary, String desg) {
		int count=0;
		//execute query
		count=jt.update(REGISTER_EMP, empno,ename,desg,salary);
		
		return count;
	}//method
	
	@Override
	public int getEmployeesCount() {
		int count=0;
		//execute Query
		count=jt.queryForObject(GET_EMP_COUNT, Integer.class);
		return count;
	}
	
	@Override
	public Map<String, Object> getEmployeeDetailsByNo(int no) {
		Map<String,Object> map=null;
		//execute Query
		map=jt.queryForMap(GET_EMP_DETAILS_BY_NO,no);
		 return map;
	}//method
	
	@Override
	public List<Map<String,Object>> getEmployeeDetailsByDesg(String desg) {
	    List<Map<String,Object>> list=null;
		//execute Query
	    list=jt.queryForList(GET_EMP_DETAILS_BY_DESG,desg);
		return list;
	}//method
	@Override
	public int getEmployeeSalaryByNo(int no) {
		int salary=0;
		//execute Query
		salary=jt.queryForObject(GET_EMP_SALARY_BY_NO,Integer.class,no);
		return salary;
	}
	
	@Override
	public int updateEmployeeSalary(int no, float newSalary) {
		int count=0;
		//execute Query
		count=jt.update(UPDATE_EMP_SALARY_BY_NO, newSalary,no);
		
		return count;
	}
	
	@Override
	public int deleteEmpByNo(int no) {
		int count=0;
		//execute Query
		count=jt.update(DELETE_EMP_BY_NO,no);
		return count;
	}
	
}//class
