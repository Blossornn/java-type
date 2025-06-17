package test.main;

/*
 * 
 * */
public class MainClass06 {
	public static void main(String[] args) {
		// boolean type 변수나 상수는 대화식으로 지우면 가독성이 좋아짐
		// can.. is.. 형식으로 많이 쓰임
		boolean isPretty = true;
		boolean canEat = false;

		// 만약 예쁘다면... 으로 읽으면 됨
		if (isPretty) {
			// 여기는 예쁘면 실행 됨
		}
		// 만약 예쁘지 않다면... 으로 읽으면 됨
		if (!isPretty) {
			// 여기는 예쁘지 않으면 실행 됨
		}
		// 만약 먹을 수 있다면... 으로 읽으면 됨
		if (canEat) {
			// 여기는 먹을 수 있으면 실행 됨
		}
		// 만약 먹을 수 없다면... 으로 읽으면 됨
		if (!canEat) {
			// 여기는 먹을 수 없으면 실행 됨
		} else { // 그렇지 않다면(먹을 수 없다가 아니면)
			// 여기는 먹을 수 있으면 실행 됨
		}
		// 만약 예쁘거나 먹을 수 있다면
		if (isPretty || canEat) {
			// 여기는 예뻐도 실행 되고, 먹을 수 있어도 실행 된다.
		}
		// 만약 예쁘고 그리고 먹을 수 있다면
		if(isPretty && canEat) {
			// 예쁘기도 하고, 먹을 수 있다면 여기가 실행된다.
		}
		// 만약 예쁘고 그리고 먹을 수 없다면
		if(isPretty && ! canEat) {
			// 예쁘기도 하고, 먹을 수 없다면 여기가 실행 된다.
		}
	}
}
