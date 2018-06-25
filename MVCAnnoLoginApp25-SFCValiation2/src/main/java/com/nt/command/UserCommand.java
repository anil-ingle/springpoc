package com.nt.command;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class UserCommand {
	@NotEmpty(message = "user name is must")
	private String user = "raja";
	@NotEmpty(message = " Password is must")
	@Size(min = 4, max = 10)
	private String pwd = "rani";
	@Range(min = 1, max = 100)
	private int age;

	private String domain[];
	private Date dob;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getDomain() {
		return domain;
	}

	public void setDomain(String[] domain) {
		this.domain = domain;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserCommand [user=" + user + ", pwd=" + pwd + ", age=" + age + ", domain=" + Arrays.toString(domain)
				+ ", dob=" + dob + "]";
	}
	
}
