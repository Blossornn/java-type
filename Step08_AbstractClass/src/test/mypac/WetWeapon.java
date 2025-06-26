package test.mypac;

public class WetWeapon extends Weapon {
@Override
public void attack() {
	this.prepare();
	System.out.println("해상 공격");
	
}
}
