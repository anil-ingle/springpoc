package com.nt.service;

import com.nt.external.ICCScoreComp;

public class FindScoreServiceImpl implements FindScoreService {
	private ICCScoreComp extService;

	public void setExtService(ICCScoreComp extService) {
		this.extService = extService;
	}

	public String findScore(int matchId) {
	    //use extenal Service
		return extService.getScore(matchId);
	}

}
