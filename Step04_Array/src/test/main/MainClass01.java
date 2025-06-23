/*
 * in javascript let nums = [10, 20, 30, 40, 50];
 * 
 * nums[0] nums[1]
 * 
 * in java int[] nums = {10, 20, 30, 40, 50};<= 정수가 들어 있는 배열의 data type은 int[]이
 * 
 * 자바에서 배열은 중괄호 열고 닫고 해서 만든다. 자바는 배열이 한 번 만들어지면 size를 늘리거나 줄일 수 없다.
 * 
 * nums[0] nums[2]
 */
package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };

		/*
		 * "김구라","해골","원숭이","주뎅이","덩어리" 5 개의 문자열이 저장 된 배열을 만들고 그 참조 값은 names 라는 변수에 대입
		 * 해보기
		 */
		String[] names = { "김구라", "해골", "원숭이", "주뎅이", "덩어리" };

		// nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기.
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);

		}

	}
}
