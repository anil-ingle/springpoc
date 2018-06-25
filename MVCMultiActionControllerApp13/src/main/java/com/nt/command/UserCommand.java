package com.nt.command;

public class UserCommand {
	private int userId;
	private String userName;
	private String addrs;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "UserCommand [userId=" + userId + ", userName=" + userName + ", addrs=" + addrs + "]";
	}

	
}
