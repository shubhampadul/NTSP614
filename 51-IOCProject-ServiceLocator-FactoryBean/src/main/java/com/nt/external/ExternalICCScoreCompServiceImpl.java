package com.nt.external;

public class ExternalICCScoreCompServiceImpl implements ExternalICCScoreCompService {

	@Override
	public String getScore(int mid)throws IllegalArgumentException{
		if(mid==1001)
			return "IND v PAK---->IND=201/2";
		else if(mid==1002)
			return "AUS v New---->AUS=385/4";
		else
		    throw new IllegalArgumentException("Invalid Match");
	}
}