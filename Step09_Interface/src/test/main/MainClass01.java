package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		// 인터페이스는 data type의 역할도 할 수 있다.
		Remocon r1 = null;
		
		// 인터페이스 단독으로 객체 생성 불가 (아예 생성자 조차 존재 안 함
		// Remocon r2 = new Remocon();
	
		// 인터페이스 type의 참조값이 필요하면 해당 인터페이스를 Implements 한 하위 클래스를 이용해서 얻기
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		System.out.println(r2.COMPANY);
		
		//인터페이스가 가지고 있는 상수 참조 (static final)
				String a = Remocon.COMPANY;
	}
}
