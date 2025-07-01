package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener {
	public MyFrame2() {
		this.setTitle("나의 프레임");
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");

		btn1.setActionCommand("insert");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");

		// 프레임의 add() 메소드를 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치
		add(btn1);
		add(btn2);
		add(btn3);
		// 하나의 액션 리스너를 여러개의 버튼에 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		// 화면 상에 실제 보이도록 한다
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀네... 그런데 어떤 버튼을 눌렀을까?");
		// Component 에 설정된 ActionCommand 를 읽어온다.
		String cmd = e.getActionCommand();
		if (cmd.equals("insert")) {
			System.out.println("추가합니다");
		} else if (cmd.equals("update")) {
			System.out.println("수정합니다");
		} else if (cmd.equals("delete")) {
			System.out.println("삭제합니다");
		}
	}

}
