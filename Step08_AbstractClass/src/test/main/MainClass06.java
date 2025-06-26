package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * - Cyber 공간을 공격하고 싶다.
		 * - 클래스 파일을 따로 만들기 싫다. => Local Inner Class로 만들면 된다.
		 * - 근데 생각 해 보면 MyWeapon, SkyWeapon, Wetpon, SpaceWeapon 등의 type 은
		 * 필요 없다.  따라서 클래스의 이름을 짓기도 쥰내 귀찮띠 => 익명의 Local Inner Class를 활용
		 * Anonymous Local Inner Class
		 */
		Weapon w1 = new Weapon() {
			
			// Weapon type의 참조 값이 이 위치에 리턴된다.
			@Override
			public void attack() {
				prepare();
				System.out.println("Cyber Bullying");
				// 여기까지
			}
		};
				w1.attack();
				/*
				 * 가상 공간을 공격해야 한다.
				 * 익명의 Local Inner Class를 이용해서 Weapon type 객체를 생성해서 공격 할 예정
				 * 1 번만 공격 할거임 = > 위처럼 w1 이라는 변수를 만들지 않고 1회용으로 객체를 만들어서 사용
				 */
				new Weapon() {
					
					@Override
					public void attack() {
						System.out.println("Virtual 공간을 공격");
						
					}
				}.attack();
	}
}
