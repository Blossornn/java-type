package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
public static void main(String[] args) {
	/*
	 * 1. MemberInfo 객체를 3개 생성해서 그 참조 값을 m1, m2, m3라는 변수에 각각 담기 
	 * 
	 * 2. m1, m2, m3 에 들어 있는 참조 값을 이용해서 3명의 회원 정보를 각각의 객체에 담기
	 * 
	 * 3. m1.printData();,m2.printData();,m3.printData();
	 * */
	MemberInfo  m1 = new MemberInfo();
	MemberInfo  m2 = new MemberInfo();
	MemberInfo  m3 = new MemberInfo();
	
	m1.num = 1;
	m2.num = 2;
	m3.num = 3;
	
	m1.name = "김";
	m2.name = "이";
	m3.name = "박";
	
	m1.addr = "소";
	m2.addr = "중";
	m3.addr = "대";
	
	m1.printData();
	m2.printData();
	m3.printData();
}
}
