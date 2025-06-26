package test.main;

import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 여기는 팀원이 코딩한다고 가정 팀원이 직접 Drill type 
		 * 객체를 생성해서 어디에 구녕을 뚫을 지 마음대로 결정 할 수 있다.
		 */
		Drill d1 = new Drill() {

			@Override
			public void hole() {
				System.out.println("구멍을 뚫어요 바닥에");

			}
		};
		useDrill(d1);
		Drill d2 = () -> {
			System.out.println("뿌아아아아앙");
		};
		useDrill(d2);

		useDrill(() -> {
			System.out.println("뿌아아아아아앙");
		});
	}

	/*
	 * useDrill() 기능을 만드는 프로그래머(팀장, 라이브러리나 프레임워크 개발자)
	 *  입장에서 생각해보자 Drill 인터페이스는 본인이 미리
	 * 만들어 놓은 상태
	 */
	public static void useDrill(Drill d) {
		d.hole();
	}

}
