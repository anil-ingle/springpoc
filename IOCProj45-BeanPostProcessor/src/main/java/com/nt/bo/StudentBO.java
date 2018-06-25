package com.nt.bo;

public class StudentBO extends BaseBO {
  private String course;
  
  public StudentBO() {
	System.out.println("StudentBO:0-param constructor");
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

@Override
public String toString() {
	return "StudentBO [course=" + course + ", getId()=" + getId() + ", getName()=" + getName() + ", getDoj()="
			+ getDoj() + "]";
}


}
