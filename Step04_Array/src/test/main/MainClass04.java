package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 1;
		m1.name = "김구라";
		m1.addr = "노량진";

		MemberInfo m2 = new MemberInfo();
		m2.num = 2;
		m2.name = "해골";
		m2.addr = "행신동";

		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "원숭이";
		m3.addr = "동물원";

		// 위에서 생성한 MemberInfo 객체의 참조값 3개를 배열에 순서대로 담아보세요
		MemberInfo[] mem = { m1, m2, m3 };
		
		// 아래처럼 할수 있다.
		MemberInfo[] members = {null,null,null};
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		
		// 이것도 가능
		MemberInfo[] members2 = new MemberInfo[3];
		members2[0] = m1;
		members2[1] = m2;
		members2[2] = m3;
	}
}
