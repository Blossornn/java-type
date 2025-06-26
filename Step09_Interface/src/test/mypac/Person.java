package test.mypac;

public class Person implements Singer, Programer {
	public void work() {
		System.out.println("일을 해요!");
	}

	@Override
	public void sing() {
		System.out.println("노래해요!");
	}
	@Override
	public void develop() {
		System.out.println("Dev");
		
	}
}
