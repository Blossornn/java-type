package test.main;

public class MainClass01 {
	// run 했을 때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[]args) {
		// 정수형 변수 선언하고 값 대입하기
		byte iByte=10;
		short iShort=500;
		int iInt=1000;
		long iLong=10000;
		
		// 실수형 변수 선언하고 값 대입하기
		float num1 = 10.1f;
		double num2 =10.2d;
		double num3 = 10.3; //d, f 를 붙이지 않으면 double type 으로 간주된다.
		
		// 상수를 만들때는 final 이라는 예약어를 추가로 붙여준다
		final int num =10;
		// type이 맞아도 변경불가
		//num=20;
		final double myNum=10.1;
		//myNum=10.2; 변경 불가
		
		
	}
}
