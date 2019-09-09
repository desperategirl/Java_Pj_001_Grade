package com.biz.grade;

import com.biz.grade.service.ScoreServiceImp;

public class C_G_Score {
	
	public static void main(String[] args) {
		
		ScoreServiceImp scs= new ScoreServiceImp();
		
		scs.input(3);
		scs.scorelist();
	}

}
