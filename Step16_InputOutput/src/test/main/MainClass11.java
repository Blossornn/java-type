package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		// 문자열을 누적시킬 객체
		var sb = new StringBuffer();
		
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
				// 읽은 문자열을 StringBuffer 객체에 누적
				sb.append(line);
				sb.append("\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// StringBuffer 에 누적된 문자열을 Stringtype으로 얻어내기
		String result = sb.toString();
		System.out.println(result);
	}
}
