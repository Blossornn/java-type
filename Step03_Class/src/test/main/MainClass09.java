package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
public static void main(String[] args) {
	/*
	 * 1. 한 명의 회원 정보를 MemberInfo 객체에 담아보세요
	 * 2. (번호, 이름, 주소는 본인 마음대로 설정해서)
	 * */
	MemberInfo  mem = new MemberInfo();
	mem.num = 26;
	mem.name = "고영석";
	mem.addr = "일산";
	
	mem.printData();
	// 2. 위에서 생성한 객체(MemberInfo)의 printData() 메소드를 호출 해 보세요
}
}
