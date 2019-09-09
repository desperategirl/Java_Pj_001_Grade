package com.biz.grade.model;

public class StudentVO {
	
	/*
	 * 학생정보 
	 * 학번, num, String, strNum(변수이름지정할 때 앞글자는 소문자로 시작해야해서 접두사 소문자로넣고 뒤에 대문자로 시작하는 변수이름을 넣음)
	 * 이름, name, String, strName
	 * 주소, addr, String, strAddr
	 * 전화번호, tel, Stirng,strTel
	 * 학과, dept, String, strDept
	 * 학년, grade, int, intGrade
	 */
	
	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private String strDept;
	private int intGrade;
	
	
	
	public StudentVO(String strNum, String strName, String strAddr, String strTel, String strDept, int intGrade) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.strDept = strDept;
		this.intGrade = intGrade;
	}
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	
	

}
