package com.nt.command;

public class RegisterCommand {
	private String name;
	private  String addrs;
	private int age;
	private int exp;
	private String skillDomain;
	private int expSalary;
	private String location;
	
	public RegisterCommand() {
		System.out.println("RegisterCommand:0-param constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getSkillDomain() {
		return skillDomain;
	}
	public void setSkillDomain(String skillDomain) {
		this.skillDomain = skillDomain;
	}
	public int getExpSalary() {
		return expSalary;
	}
	public void setExpSalary(int expSalary) {
		this.expSalary = expSalary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", addrs=" + addrs + ", age=" + age + ", exp=" + exp + ", skillDomain="
				+ skillDomain + ", expSalary=" + expSalary + ", location=" + location + "]";
	}
   
}
