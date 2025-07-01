package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	public MyFrame() {
		this.setTitle("나의 프레임");
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		// ActionListener 는 메소드 1개짜리 인터페이스
		// UI에 어떤 동작이 일어 났을 때 호출 될 예정인 메소드를 가지고 있는 ActionListener 객체
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌러어어엇!!!!????");
			}
		};
		// 첫 번째 버튼에 액션 리스너 등록
		btn1.addActionListener(listener);
		ActionListener listener2 = (e) -> {
			System.out.println("버튼을 또 눌러어어엇!!!!!????");
		};
		// 두 번째 버튼에 액션 리스너 등록
		btn2.addActionListener(listener2);

		// 세 번째 버튼에 액션 리스너 등록
		btn3.addActionListener((e) -> {
			System.out.println("세 번째 버튼까지 눌러!!!!????");
		});

		// 네 번째 버튼에 액션 리스너 등록
		// this는 MyFrame 객체의 참조값을 가리킨다.
		btn4.addActionListener(this);

		// 화면 상에 실제 보이도록 한다
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("test");

	}
}
