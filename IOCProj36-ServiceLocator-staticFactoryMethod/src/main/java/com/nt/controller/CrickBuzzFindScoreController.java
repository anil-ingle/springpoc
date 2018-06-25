package com.nt.controller;

import com.nt.service.CrickBuzzFindScoreService;

public class CrickBuzzFindScoreController {
	private CrickBuzzFindScoreService service;
	
	public void setService(CrickBuzzFindScoreService service) {
		this.service = service;
	}
	
	public String viewScore(int matchId){
		return service.findScore(matchId);
	}
}//class
