package test.mypac;

public class Zoo {
	// 내부 클래스 (Inner Class)
	public class Monkey {
		public void say() {
			System.out.println("안녕! 나는 원숭이야.");
		}
	}

	public class Tiger {
		public void roar() {
			System.out.println("응애~");
		}
	}
	// 메소드 ( 호출 되면 Monkey 객체를 생성해서 리턴 해 주는 메소드)
	public Monkey getMonkey() {
		return new Monkey();
	}
	// public static void main () {} 이 메소드를 호출해서 Monkey type 객체의 참조 값을 얻어내려면?
 // 	Zoo z = new Joo(); 
	// Monkey m  = 	z.getMonkey(); (자세히 쓰려면 Zoo.Monkey 클래스임)
		// 메소드 ( 호출 되면 Tiger 객체를 생성해서 리턴 해 주는 메소드)
		public Tiger getTiger() {
			return new Tiger();
	}
}
