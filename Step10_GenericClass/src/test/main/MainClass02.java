package test.main;

import test.box.FruitBox;
import test.fruit.*;

public class MainClass02 {
	public static void main(String[] args) {
		// Apple 을 담을 용도로 사용 할 FruitBox 객체 생성
		FruitBox<Apple> box1 = new FruitBox<Apple>(); 
		
		// Banana 를 담을 용도로 사용 할  FruitBox 객체 생성
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		
	}
}
