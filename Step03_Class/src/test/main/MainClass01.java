package test.main;

import java.io.File;
import java.io.IOException;
// java.utill 패키지에 있는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		// 문자열을 다룰 때는 String type 을 사용하면 된다.
		String name = "kim";
		String str = null;
		// 랜덤한 숫자를 얻어내고 싶다면? 랜덤한 숫자를 생성 해 주는 기능을 가지고 있는 객체가 필요하다.
		Random ran = null;
		ran = new Random();
		boolean result1 = ran.nextBoolean();
		int num = ran.nextInt(1, 45);
		System.out.println(num);
		System.out.println(result1);
		// 콘솔창에 문자열을 출력하고 싶다면? 콘솔창에 문자열을 출력하는 기능을 가지고 있는 객체가 필요

		// 파일 시스템에 memo.text 파일을 만들고 싶다면? 파일을 만들 수 있는 기능을 가지고 있는 객체가 필요
		File f = new File("/Users/koyoungseok/memo.txt");
		f.createNewFile();
		// 콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면? 콘솔창에 입력한 내용을 이용해서
		// int 나 String을 만들어 내는 기능을 가지고 있는 객체가 필요
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
