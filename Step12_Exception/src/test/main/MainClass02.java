package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력 : ");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어 지는 수 입력 : ");
		String inputNum2 = scan.nextLine();
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);

			int result = num2 / num1; // 몫
			int result2 = num2 % num1;// 나머지
			System.out.println(num2 + " 를 " + num1 + " 으로 나눈 몫 : " + result);
			System.out.println(num2 + " 를 " + num1 + " 으로 나눈 나머지 : " + result2);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("좋은 말 할 때 숫자로 입력 하시쇼");
		}catch(ArithmeticException ae ) {
			System.out.println("어떤 수든 0으로 나눌 수는 음서.");
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
