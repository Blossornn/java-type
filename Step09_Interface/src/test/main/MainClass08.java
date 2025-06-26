package test.main;

import test.mypac.Person;
import test.mypac.Programer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		// Person 객체를 생성해서 Person type으로 받으면 모든 메소드를 사용 할 수 있다.
	Person p1= new Person();
	p1.work();
	p1.sing();
	p1.develop();
	
	System.out.println("--------");
	// Person 객체를 생성해서 Singer type으로 받으면 sing() 메소드만 사용 가능
	Singer p2 = new Person();
	p2.sing();
	
	// Person 객체를 생성해서  Programer type으로 받으면 Devleop() 메소드만 사용 가능
	System.out.println("--------");
	Programer p3 = new Person();
	p3.develop();
	}
}
