package test.mypac;

// extends Weapon 은 프로그래밍을 잘하는 팀장 or 라이브러리 만드는 회사에서 만든 추상 클래스라고 가장
public class SkyWeapon extends Weapon {
	/*
	 * Weapon 객체 (추상 클래스로 생성 된 객체) 가 제공 해 주는 기능을 활용하면서
	 * attack() 나의 상황(용도, 프로젝트 요구사항)에 맞게 구현할 수 있다.
	 */
	@Override
	public void attack() {
		// 부모객체가 제공해주는 기능도 사용가능
		this.prepare();
		System.out.println("공중 공격");
	}
}
