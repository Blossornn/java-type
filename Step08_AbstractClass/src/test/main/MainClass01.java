package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상 클래스도 data type 의 역할은 할 수가 있다.
		Weapon w1 = null;

		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();

		// 그렇다면 Weapon type의 참조값은 어떻게 얻어내기?
		// Weapon w2 = new Weapon();
		// 데이터 타입의 역할은 할 수 있으나 단독으로 객체 생성은 불가하다.
	}
}
