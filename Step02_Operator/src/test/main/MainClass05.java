package test.main;

/*
 *  논리 연산자 테스트
 *  &&, ||, !
 *  and or not
 * 그리고, 또는,~가 아니
 * */
public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * or 연산 또는 이라고 읽음 어느 하나만 true 면 결과는 true 모두 false 일때만 false
		 */
		boolean result1 = false || false; // false
		boolean result2 = false || true; // true
		boolean result3 = true || false; // true
		boolean result4 = true || true; // true
		/*
		 * and 연산 그리고 라고 읽음 모두 다 true일 때만 true 어느 하나만 false면 false
		 */

		boolean result5 = false && false; // false
		boolean result6 = false && true; // false
		boolean result7 = true && false; // false
		boolean result8 = true && true; // true

		/*
		 * not 연산 ~가 아니면 이라고 읽음 boolean 값을 반전 시킨다
		 */
		boolean result9 = true; // false
		boolean result10 = !false; // true

	}
}
