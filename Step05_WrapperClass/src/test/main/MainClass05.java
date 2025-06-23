package test.main;

import java.io.*;
import java.util.*;

public class MainClass05 {
	/*
	 * 1. 콘솔 창으로부터 입력 받을 수 있는 Scanner 객체를 생성해서 그 참조 값을 
	 * scan 이라는 지역 변수에 담기 
	 * 2. scan에 담겨 있는 Scanner 객체를 2번 사용해서 콘솔 창으로부터 숫자를 2개 입력 받기 
	 * 3. 입력받은 숫자(문자열)를 실제 숫자로 변경 
	 * 4. 두 수의 합을 구해서 콘솔창에 예쁘게 출력
	 */
	public static void main(String[] args) {
//		InputStream is = System.in;
//		Scanner scan = new Scanner(is);
//
//		System.out.print("첫 번째 숫자 입력 : ");
//		String str1 = scan.nextLine();
//
//		System.out.print("두 번째 숫자 입력 : ");
//		String str2 = scan.nextLine();
//
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//
//		int sum = num1 + num2;
//		System.out.println("두 숫자의 합은 : " + sum);
		Scanner scan = new Scanner(System.in);
		
				System.out.print("첫 번째 숫자 입력 : ");
				String str1 = scan.nextLine();
		
				System.out.print("두 번째 숫자 입력 : ");
				String str2 = scan.nextLine();
		
				double num1 = Double.parseDouble(str1); // int → double
		        double num2 = Double.parseDouble(str2); // int → double

		        double sum = num1 + num2; // int → double
		     String info =  String.format("%f 과 %f의 합은 : %f1", num1,num2,sum);
		        System.out.println("두 숫자의 합은 : " + sum);
				System.out.println(info);
	}
}
