package test.frame01;

import javax.swing.JFrame;
/*
 *  Graphic User Interface 를 만들 수 있는 클래스 설계
 *  
 *  1. JFrame 클래스를 상속 받는다
 *  2. 생성자에서 필요한 초기화 작업을 한다.
 *  3. main() 메소드에서 이 클래스로 객체를 생성하면 프레임(Window)가 만들어 진다.
 */
public class MyFrame extends JFrame{
	// 생성자
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레이무");
		// 프레임의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// 종료버튼 눌렀을 때 전체가 꺼지도록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면상에 실제 보이도록
		setVisible(true);
	}
}
