package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.ScoreVO;


public class ScoreServiceImp implements ScoreService {

	private List<ScoreVO> scoreList;
	Random rnd = new Random();
	
	
	@Override
	public void input(int size) {
		
		scoreList = new ArrayList<ScoreVO>();
		
		for (int i = 0; i < size; i++) {

			
			String strNum = String.format("%d", (i + 1));
		
			int intKor = rnd.nextInt(21)+80;
			int intEng = rnd.nextInt(31)+70;
			int intMath = rnd.nextInt(41)+60;
			int intTotal = intKor + intEng + intMath;
			int intAvg = (intTotal / 3);
			
			
			ScoreVO scvo = new ScoreVO();
			
			scvo.setStrNum(strNum);
			scvo.setIntKor(intKor);
			scvo.setIntEng(intEng);
			scvo.setIntMath(intMath);
			scvo.setIntTotal(intTotal); 
			scvo.setIntAvg(intAvg); 
		
			
			
			scoreList.add(scvo);
			
		
			
			
		}
	}

	@Override
	public void scorelist() {
	
		

		System.out.println("=====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("====================================================");
		
		for(ScoreVO scvo : scoreList) { 
			System.out.printf("%s\t", scvo.getStrNum());
			System.out.printf("%d\t", scvo.getIntKor());
			System.out.printf("%d\t", scvo.getIntEng());
			System.out.printf("%d\t", scvo.getIntMath());
			System.out.printf("%d\t", scvo.getIntTotal());
			System.out.printf("%d\n", scvo.getIntAvg());
			
		}
		System.out.println("======================================================");
		

	}

}
