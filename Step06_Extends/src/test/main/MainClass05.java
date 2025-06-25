package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		p1.call();
		p1.mobileCall();
		p1.takePickture();
		p1.doInternet();
		
		System.out.println("----------------------");
		// SmartPhone 객체를 생성해서 HandPhone type 으로 받은 다음
		HandPhone p2 = new SmartPhone();
		// 사진을 찍으면? 몇 화소 일까
		p2.takePickture();
		System.out.println("----------------------");
		HandPhone p3 = new HandPhone();
		p3.takePickture();
	}
}
