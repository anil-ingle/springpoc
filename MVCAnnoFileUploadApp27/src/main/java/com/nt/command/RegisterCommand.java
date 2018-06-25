package com.nt.command;

import org.springframework.web.multipart.MultipartFile;

public class RegisterCommand {
	private MultipartFile file1;
	private MultipartFile file2;
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	public MultipartFile getFile2() {
		return file2;
	}
	public void setFile2(MultipartFile file2) {
		this.file2 = file2;
	}

}
