package com.nt.bo;

public class ProfileBO {
	private int profiledId;
	private String profileName;
	private String email;
	private int followers;
	private int  friends;
	public int getProfiledId() {
		return profiledId;
	}
	public void setProfiledId(int profiledId) {
		this.profiledId = profiledId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFriends() {
		return friends;
	}
	public void setFriends(int friends) {
		this.friends = friends;
	}

}
