package com.nt.service;

import com.nt.external.ExternalICCScoreCompService;

public class CrickBuzzScoreServiceImpl implements CrickBuzzScoreService {
	private ExternalICCScoreCompService extComp=null;

	public CrickBuzzScoreServiceImpl(ExternalICCScoreCompService extComp) {
		System.out.println("CrickBuzzScoreServiceImpl.CrickBuzzScoreServiceImpl()");
		this.extComp = extComp;
	}

	@Override
	public String findScore(int mid) {
		//use external service
		return extComp.getScore(mid);
	}
}