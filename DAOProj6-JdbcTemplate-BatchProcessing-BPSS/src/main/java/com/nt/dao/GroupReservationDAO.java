package com.nt.dao;

import java.util.List;

import com.nt.bo.PassengerBO;

public interface GroupReservationDAO {
   public int[] bulkInsert(List<PassengerBO> listBO);
}
