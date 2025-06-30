package test.mypac;
/*
 * 인터페이스에서 메소드의 접근 지정자 public 생략하면 기본 public이다.
 */

@FunctionalInterface
public interface MyFunction {
	// 추상 메소드
	public void execute();

	// java9 부터 추가 된 문법 defalut 메소드
	public default void log() {
		System.out.println("실행 로그 출력");
	}

	// java9 부터 추가 된 문법 static 메소드
	public static void help() {
		System.out.println("도움말");
	}
}
