package test.main;

public class MainClass03 {
	/*
	 * i 라는 변수를 만들고 초기 값 0 대입
	 * i 가 10보다 작은 동안에 반복한다 (작으면 for 문 블럭을 실행한다)
	 * i 를 1씩 증가 시키면서
	 * i 는 for 문 안에서 만들어진 지역변수(for 문이 종료되면 i 는 사라진다)
	 * */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");
		/* 콘솔창에 9부터 0까지 순서대로 출력
		 * i 라는 변수를 만들고 초기값 9 대입
		 * i 가 0 이상인 동안에 반복한다
		 * i 를 1씩 감소 시키면서
		*/
		for (int i = 9; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
