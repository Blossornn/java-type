package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i + " 반복합니다.");
			i++;
		}
		System.out.println("-------------");

		int j = 0;
		// 무한 루프는 실행하다가 break문을 만나면 탈출 할 수 있음
		while (true) {
			System.out.println(j + " 반복합니다");
			j++;
			// 반복문 탈출 조건물을 이용해서
			if (j == 5) {
				break; // 강제 탈출
			}
		}
	}
}
