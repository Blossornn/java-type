package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		// 인사 말을 담을 ArrayList 객체를 생성하여 참조 값을 greets 라는 지역변수에 대입
		ArrayList<String> greets = new ArrayList<>();
		// Greets 에 들어 있는 참조값을 이용해서 인사말 3개를 임의로 담기
		greets.add("buenas dias!");
		greets.add("buenas tardes!");
		greets.add("buenas noches!");

		Consumer<String> con = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// t는 Consumer 객체를 사용하는 ArrayList 객체에 저장된 item이 전달 됨
				System.out.println(t);
			}
		};
		/*
		 * .forEach() 메소드를 호출하면서 전달할 Consumer 객체의 accept() 메소드가 
		 * 배열에 저장된 item의 갯수만큼 호출되고
		 * 메소드의 매개 변수에는 배열에 저장된 아이템이 순서대로 전달 된다.
		 */
		greets.forEach(con);

		System.out.println("-----------------");

		Consumer<String> con2 = (t) -> {
			System.out.println(t);
		};
		greets.forEach(con2);
		System.out.println("-------------");
		greets.forEach(item -> System.out.println(item));
		System.out.println("-------------");
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
