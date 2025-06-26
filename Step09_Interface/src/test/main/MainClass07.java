package test.main;

import test.mypac.*;
public class MainClass07 {
	public static void main(String[] args) {
		Operator plus = (double num1, double num2) ->{
			return num1 + num2;
		};
		// 람다 표현식 ( 매개변수 타입 생략 가능)
		Operator minus = (num1, num2)->{
			return num1 - num2;
		};
		// 메소드의 {} 생략하고 return 예약어 없이 리턴할 값만 -> 우측에 작성해도 됨
		Operator  multiply = (a, b) ->a*b;
	
	 double result1 =	plus.execute(10, 10); // 20
	 double result2 =	minus.execute(10, 10); // 0
	 double result3 =	multiply.execute(10, 10); // 100
	 
	}
}
