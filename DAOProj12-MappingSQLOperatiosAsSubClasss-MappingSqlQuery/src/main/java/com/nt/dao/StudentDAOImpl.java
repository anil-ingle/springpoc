package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("stDAO")
public class StudentDAOImpl implements StudentDAO {
	private static final String GET_STUDENTS_BY_NO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
	private static final String  GET_STUDENTS_BY_ADDRS="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SADD=?";
	private static final String  UPDATE_STUDENT_BY_NO="UPDATE STUDENT SET SNAME=?,SADD=? WHERE SNO=?";
	
	private StudentSelectorByNo stSelectorByNo=null;
	private StudentSelectorByAddrs stSelectorByAddrs=null;
	private StudentUpdator stUpdator=null;
	
	@Autowired
	public StudentDAOImpl(DataSource ds){
		stSelectorByNo=new StudentSelectorByNo(ds,GET_STUDENTS_BY_NO);
		stSelectorByAddrs=new StudentSelectorByAddrs(ds, GET_STUDENTS_BY_ADDRS);
		stUpdator=new StudentUpdator(ds,UPDATE_STUDENT_BY_NO);
	}

	@Override
	public StudentBO getStudentByNo(int no) {
		StudentBO bo=null;
		//execute the query through sub class object
		bo=stSelectorByNo.findObject(no);
		return bo;
	}
	public List<StudentBO> getStudentsByAddrs(String addrs){
		List<StudentBO> listBO=null;
		listBO=stSelectorByAddrs.execute(addrs);
		return listBO;
	}
	
	@Override
	public int updateStudentDetailsByNo(int no, String newName, String newAddrs) {
		int count=0;
		count=stUpdator.update(newName,newAddrs,no);
		return count;
	}

	
	//---------------inner classes begin-------------------------------------
	//innner and sub class for a select query
	private class StudentSelectorByNo extends MappingSqlQuery<StudentBO>{
		
		public  StudentSelectorByNo(DataSource ds,String query) {
			//set dataSource and query to Super class
			super(ds,query);
			//make super class to declare parameters
			super.declareParameter(new SqlParameter(Types.INTEGER));
			//make super class to compile the query
			super.compile();
		}//class

		@Override
		public StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			System.out.println("mapRow(-,-) for stSelectotByNo");
			StudentBO bo=null;
			//copy each record of ResultSet ot StudentBO class object
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			return bo;
		}//mapRow(-,-)
		
	}//innerclass
	
	private class StudentSelectorByAddrs extends MappingSqlQuery<StudentBO>{
		
		public StudentSelectorByAddrs(DataSource ds,String query) {
			//set query and dataSource
			super(ds,query);
			//make super class to declare params
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			//compile the query
			super.compile();
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			System.out.println("mapRow(-,-) for stSelectorByAddrs");
			StudentBO bo=null;
			//copy each record of ResultSet ot StudentBO class object
			bo=new StudentBO();
			bo.setSno(rs.getInt(1));
			bo.setSname(rs.getString(2));
			bo.setSadd(rs.getString(3));
			return bo;
		}
	}//inner class
	
	private class StudentUpdator extends SqlUpdate{
		
		public StudentUpdator(DataSource ds,String query) {
			//set query and dataSource
			super(ds,query);
			//make super class to declare params
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			//compile the query
			super.compile();
		}//constructor
	}//inner class
}//outerclass
