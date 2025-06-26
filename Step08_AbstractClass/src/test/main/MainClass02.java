package test.main;

import test.mypac.MyWeapon;
import test.mypac.SkyWeapon;
import test.mypac.Weapon;
import test.mypac.WetWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		// 공중 공격을 하는 Weapon type 객체
		Weapon w1 = new SkyWeapon();
		w1.attack();
		// 지상 공격을 하는 Weapon type 객체
		Weapon w2 = new MyWeapon();
		w2.attack();
		/*
		 * 해상 공격을 하는 Weapon type 객체를 만들어서 .attack() 메소드를 호출했을 때 해상공격이 되도록
		 * 단) 기존에 만든 SkyWeapon, Myweapon, Weapon을 수정하지 말고
		 * 새로운 클래스를 만들어서 구현
		 */
		Weapon w3 = new WetWeapon();
		w3.attack();
	}
}
