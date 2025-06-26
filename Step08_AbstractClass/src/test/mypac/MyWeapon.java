package test.mypac;

// 추상 클래스를 상속 받으면 자식 클래스는 부모의 추상 메소드를 반드시 Override 해야 함
public class MyWeapon  extends Weapon{

	@Override
	public void attack() {
		this.prepare();
		System.out.println("지상 공격");
		
	}

}
