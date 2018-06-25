package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.PassengerBO;

public class GroupReservationDAOImpl implements GroupReservationDAO {
	private static final String SEQ_PID="select PID_SEQ.nextVal from dual";
	private static final String INSERT_PASSENGER="INSERT INTO RAILTICKETRESERVATION VALUES(?,?,?,?,?)";
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	

	@Override
	public int[] bulkInsert(List<PassengerBO> listBO) {
		int result[]=null;
		result=jt.batchUpdate(INSERT_PASSENGER,new BatchProcessing(listBO));
		return result;
	}//method
	
	private class BatchProcessing implements BatchPreparedStatementSetter{
		private List<PassengerBO> listBO;
		
		public BatchProcessing(List<PassengerBO> listBO) {
			this.listBO=listBO;
		}
		
		private int getPassengerId(){
			int pid=0;
			pid=jt.queryForObject(SEQ_PID, Integer.class);
			return pid;
			
			
		}
		

		@Override
		public int getBatchSize() {
			System.out.println("getBatchSize()");
			return listBO.size();
		}

		@Override
		public void setValues(PreparedStatement ps, int index) throws SQLException {
			System.out.println("setValues(-,-)");
			//get pid dynamically from seqeunce
			listBO.get(index).setPid(getPassengerId());
			//assign each set of query param values to the batch
		    ps.setInt(1,listBO.get(index).getPid());
		    ps.setString(2,listBO.get(index).getName());
		    ps.setInt(3,listBO.get(index).getAge());
		    ps.setString(4,listBO.get(index).getBoardingForm());
		    ps.setString(5,listBO.get(index).getDestination());
		}//method
		
	}//inner class
}//class
