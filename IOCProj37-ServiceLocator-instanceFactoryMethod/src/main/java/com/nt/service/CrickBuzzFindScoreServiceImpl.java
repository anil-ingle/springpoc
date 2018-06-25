package com.nt.service;

import com.nt.external.ICCScoreComp;

public class CrickBuzzFindScoreServiceImpl implements CrickBuzzFindScoreService {
   private ICCScoreComp extComp;
   
	public void setExtComp(ICCScoreComp extComp) {
	this.extComp = extComp;
}

	public String findScore(int matchId) {
		//use Extenal SErvice component
		//here LocalService class of CrickBuzz is using External service
		return extComp.getScore(matchId);
	}

}//class
