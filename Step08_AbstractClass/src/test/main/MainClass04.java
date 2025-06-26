package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  - 메소드 안에 지역변수, 클래스를 정의 할 수 있다.
		 *  - 메소드 안에서만 사용 할 수 있다.
		 *  - 지역 내부 클래스(Local Inner Class)라고 한다.
		 *  
		 */
		class Cat {
			public void say() {
				System.out.println("응애~");
			}
		}
		// Local Inner Class 로 객체도 생성 할 수 있다.
		Cat c1 = new Cat();
		c1.say();
	}
}
