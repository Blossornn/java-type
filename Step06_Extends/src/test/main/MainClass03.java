package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		// 아래의 3줄을 실행하면 참조 값이 몇 개가 나올까?(객체가 몇 개가 생성 될까?)
		HandPhone p1 = new HandPhone();
		// HandPhone type 안에 있는 값을 Phone type (부모 type) 변수에 대입 가능
		Phone p2 = p1;
		// HandPhone type 안에 있는 값을 Object type (부모 type) 변수에 대입 가능
		Object p3 = p1;
		
		HandPhone p4 = (HandPhone)p3;
	}
}
