package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.StudentVO;

public class StudentServiceImp implements StudentService {

	Scanner scan = new Scanner(System.in);

	private List<StudentVO> studentList;

	@Override
	public void input(int size) {

		studentList = new ArrayList<StudentVO>();
		for (int i = 0; i < size; i++) {

			String strNum = String.format("%d", (i + 1));
		    
			System.out.print(" 이름 >> ");
			String strName = scan.nextLine();
			System.out.print(" 전화번호 >> ");
			String strTel = scan.nextLine();
			System.out.print(" 주소 >> ");
			String strAddr = scan.nextLine();
			System.out.print(" 학과 >> ");
			String strDept = scan.nextLine();
			System.out.print(" 학년 >> ");
			String intGrade = scan.nextLine();
		
		
			

			StudentVO stvo = new StudentVO();

			stvo.setStrNum(strNum);
			stvo.setStrName(strName);
			stvo.setStrAddr(strAddr);
			stvo.setStrTel(strTel);
			stvo.setStrDept(strDept);
			// stvo.setIntGrade(intGrade);

			studentList.add(stvo);

		}

	}

	@Override
	public void studentlist() {

		System.out.println("====================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t학과\t학년");
		System.out.println("====================================================");

		for (StudentVO stvo : studentList) {
			System.out.printf("%s\t", stvo.getStrNum());
			System.out.printf("%s\t", stvo.getStrName());
			System.out.printf("%s\t", stvo.getStrTel());
			System.out.printf("%s\t", stvo.getStrAddr());
			System.out.printf("%s\t", stvo.getStrDept());
			System.out.printf("%d\n", stvo.getIntGrade());
		}
		System.out.println("======================================================");

	}

}
