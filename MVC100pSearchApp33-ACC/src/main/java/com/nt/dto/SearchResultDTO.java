package com.nt.dto;

import java.io.Serializable;

public class SearchResultDTO extends SearchDTO implements  Serializable{
  private int deptno;
  private int mgrNo;
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public int getMgrNo() {
	return mgrNo;
}
public void setMgrNo(int mgrNo) {
	this.mgrNo = mgrNo;
}
}
