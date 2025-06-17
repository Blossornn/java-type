package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 숫자 중에서 짝수의 총합을 구해서 출력 해보기
		 * */
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if (i % 2== 0) {
			 sum += i;
			}
		}
		System.out.println("1~100 사이의 숫자 중에서 짝수의 총 합 : " + sum);
	
		sum=0;
		// i를 2, 4, 6,  8, 10 ... 98, 100 으로 변하는 for문
		for(int i=0; i<=100; i+=2) {
			sum+=i;
		}
	}
}
