package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			// 조금 더 좋은 기능을 가지고 있는 BufferedReader 객체 생성
			var br = new BufferedReader(fr);
			// 무한 루프 돌면서
			while (true) {
				// 한 줄씩 읽어낸다 ( 1 줄의 기준은 개행 기호)
				String line = br.readLine();
				// 더이상 읽을 line이 없다면 반복문 탈출
				if (line == null)
					break;
				// 읽은 문자열 출력
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
