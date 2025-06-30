package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		// 위에서 생성한 스캐너 객체로 반복문 돌면서 문자열을 5번 입력 받아서
		// 입력 받을 때 마다 ArrayList<String> 객체에 add() 하고
		// 다 입력 받으면 다시 한 번 반복문 돌면서 ArrayList<String> 객체에 저장된 문자열 5개를
		// 순서대로 콘솔창에 출력하는 프로그래밍
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String test = scan.nextLine();
			list.add(test);
		}
		System.out.println(list);
		for (String test : list) {
			System.out.println(test);
		}
	}
}
