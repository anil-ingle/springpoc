package com.nt.beans;

import java.util.Arrays;

public class Student {
	private int[] marks;

	/*public void setMarks(int[] marks) {
		this.marks = marks;
	}
*/
	public void setMarks(int  ...marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + "]";
	}
	
	

}
