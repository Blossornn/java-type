package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame {
	// 필요한 필드 정의 하기
	JTextField inputName, inputAddr;

	// 생성자
	public MemberFrame() {
		setLayout(new BorderLayout());
		// JLabel2개
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("주소");
		// JTextField
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);

		// JButton
		JButton insertBtn = new JButton("저장");

		// 패널에 UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		// 패널의 배경 색 설정
		panel.setBackground(Color.orange);
		// 패널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);

		insertBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = inputName.getText();
				String addr = inputAddr.getText();

				MemberDto dto = new MemberDto();
				dto.setName(name);
				dto.setAddr(addr);

				boolean isSuccess = new MemberDao().insert(dto);

				if (isSuccess) {
					JOptionPane.showMessageDialog(MemberFrame.this, name + " 님의 정보가 DB에 저장되었습니다.");
				} else {
					System.out.println("잠시 후 다시 시도해주세요");
				}
			}
		});
	}

	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
