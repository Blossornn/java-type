package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// 1 byte 처리 스트림
		InputStream kbd = System.in;
		// 2byte 처리 스트
		var isr = new InputStreamReader(kbd);
		// bufferedReader 의 생성자로 InputStreamReader 객체를 전달해서 객체 생성
		var br = new BufferedReader(isr);
		// var br = new BufferedReader(new InputStreamReader(System.in)); < 위에 코드를 한 줄로
		// 정리
		System.out.println("입력 : ");
		try {
			String line = br.readLine();
			System.out.println("line : " + line);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
