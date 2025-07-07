package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {

		/*
		 * [try-with-resources]
		 * 
		 * - AutoCloseable 인터페이스를 구현한 객체에 한해서 사용 가능
		 * 
		 * - null 체크와 close() 호출이 자동화
		 * 
		 */

		try (var fis = new FileInputStream("/Users/koyoungseok/playGround/SouthKorea.png");
				var fos = new FileOutputStream("/Users/koyoungseok/playGround/copied4.png");) {
			// byte 알갱이 1024개를 한 번에 읽어 들일 수 있는 배열 객체 생성
			byte[] buffer = new byte[1024];
			// 반복문 돌면서
			while (true) {
				// byte[] 객체를 전달하면서 배열에 읽어들이도록 하고 몇 byte 를 읽어 들였는지 리턴 받는다
				int readedCount = fis.read(buffer);
				// 만일 더이상 읽을 byte가 없다면 반복문 탈출
				if (readedCount == -1)
					break;
				// 배열 안에 읽어 들인 데이터를 읽은 갯수 만큼 출력
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 Copy 했습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
