package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
			File f = new File("memo.txt");
			try {
				// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
				var fr = new FileReader(f);
				// 무한 루프 돌면서
				while(true) {
					// 한 글짜식 읽어들인다 (문자의 코드 값)
					int code = fr.read();
					// 만일 더이상 읽을 문자가 없다면
					if(code==-1) break;
					// code 를 문자로 변환
					char ch = (char)code;
					System.out.println(ch);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
}
