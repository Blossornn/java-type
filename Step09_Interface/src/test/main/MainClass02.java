package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		Object r1 = new MyRemocon();
		Remocon r2 = new MyRemocon();
		MyRemocon r3 = new MyRemocon();
		useRemocon(r3);
		useRemocon(r2);
		// useRemocon(r1); r1은 object type이라서 casting 해야 호출 할 수 있음
		useRemocon((Remocon)r1);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
