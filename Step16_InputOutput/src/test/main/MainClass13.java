package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		try {
			// 파일로부터 받은 byte 알갱이를 읽어들일 객체 생성
			var fis = new FileInputStream("/Users/koyoungseok/playGround/SouthKorea.png");
			// byte 알갱이를 파일에 출력 할 객체 생성
			var fos = new FileOutputStream("/Users/koyoungseok/playGround/copied2.png");
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
			// 마무리 작업
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
