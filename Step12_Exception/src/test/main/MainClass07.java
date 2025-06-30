package test.main;

import test.mypac.WowException;
import test.mypac.myUtil;

public class MainClass07 {
	public static void main(String[] args) {
			System.out.println("main 메소드 시작");
		try {
			myUtil.generate();
		} catch(WowException we) {
			System.out.println("오잉 WowException이 발생했네?");
			System.out.println("예외 메시지 : " + we.getMessage());
		}
		System.out.println("main 메소드 종료");
	}
}
