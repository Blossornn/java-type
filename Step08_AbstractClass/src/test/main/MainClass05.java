package test.main;

import java.util.Random;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * - 우주를 공격하고 싶다. - Weapon 추상 클래스를 상속 받은 클래스를 파일로 만들어야 하는 쥰내 귀찮음 - Local Inner
		 * Class 로 만들면 좀 편할 듯 ?
		 * 
		 */
		class SpaceWeapon extends Weapon {

			@Override
			public void attack() {
				System.out.println(" 우주를 줄게");
			}
		}
		Weapon sp = new SpaceWeapon();
		sp.attack(); // 메소드는 1번만 호출하면 되는데 굳이 w1이라는 지역변수를 만들어야 할까?
		
		// Weapon Type 의 변수를 만들기도 쥰내 귀찮음
		new SpaceWeapon().attack(); // 객체를 생성해서 1회용으로 사용하는 것도 가능
//		int ranNum = new Random().nextInt(); < 예를 들려고 보여주심
		
	}
}
