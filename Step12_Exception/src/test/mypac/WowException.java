package test.mypac;
/*
 * 필요한 경우 예외 클래스를 직접 정의 해서 해당 예외를 원하는 시점에 발생 시켜야 하는 경우도 있음
 * 
 * 이 클래스로 생성한 예외를 발생 시키고 싶으면
 * 
 * throw new WowException(예외 메세지); 하면 됨
 */

public class WowException extends RuntimeException{ // 1. RumtimeException 을 상속 받는다.
	// 생성자에 전달되는 예외 메세지를 부모 생성자에 전달
	public WowException(String msg) {
		super(msg);
	}
}
