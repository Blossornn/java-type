package test.main;

import test.mypac.Zoo;


public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();
		Zoo.Monkey m1 = z1.getMonkey();
		m1.say();
		
		// z1에 들어 있는 참조값을 이용해서 Tiger 객체의 참조값을 얻어낸 다음 roar() 메소드를 호출해  보기
		Zoo.Tiger t1 = z1.getTiger();
		t1.roar();
	}
}
