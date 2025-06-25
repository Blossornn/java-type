package test.main;

import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		// Shape 객체 생성
		Shape s1 = new Shape(100, 200); // default 생성자가 없어서 이렇게는 객체 생성 불가
		s1.printInfo();

		Circle c1 = new Circle(200, 300, 10);
		c1.printArea();
		c1.printInfo();
	}
}
