package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 여기서 정의된 useWeapon() 메소드를 호출 하려면?
		 */
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("가즈아");
			}
		};
		useWeapon(w1);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("배고파ㅏ");
				
			}
		});
	}

	public static void useNum(int num) {

	}

	public static void useString(String name) {

	}

	public static void useWeapon(Weapon w) {
		w.attack();
	}
}
