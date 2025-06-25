package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
			//Item 객체 생성
		Item item = new Item();
		item.setName("전자시계");
		
		
		// Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용 하려면?
		// 활용이란?
		// 1 . 특정 변수에 담고 싶다.
		// 2 . 어딘가에 전달 하고 싶다.
		// 3 . 콘솔창에 출력 하고 싶다  등등 ...
		String a = item.getName();
		System.out.println(item.getName());
	}
}
