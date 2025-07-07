package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame {
	// 필요한 필드 정의 하기
	JTextField inputName, inputAddr;
	// 표 형식으로 정보를 출력할 UI
	JTable table;
	// JTable 에 출력 할 data 를 공급 해 줄 모델 객체
	DefaultTableModel model;
	// Member Dao 를 자주 사용 할 ㅇㅖ정이라 미리 필드에 참조하기
	MemberDao dao = new MemberDao();

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
		JButton deleteBtn = new JButton("삭제");
		JButton updateBtn = new JButton("수정");

		// 수정 버튼
		updateBtn.addActionListener((e) -> {
			int selectedRow = table.getSelectedRow();
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row 를 선택해 주세요!");
				return;
			}
			int num = (int) model.getValueAt(selectedRow, 0);
			MemberDto dto = dao.getByNum(num);

			JTextField inputName = new JTextField(10);
			JTextField inputAddr = new JTextField(10);
			inputName.setText(dto.getName()); // 기존 값 채워줌
			inputAddr.setText(dto.getAddr());
			JPanel editPanel = new JPanel();
			editPanel.add(new JLabel("이름:"));
			editPanel.add(inputName);
			editPanel.add(new JLabel("주소:"));
			editPanel.add(inputAddr);

			int result = JOptionPane.showConfirmDialog(this, editPanel, num + " 번 회원 수정", JOptionPane.OK_CANCEL_OPTION);

			if (result == JOptionPane.OK_OPTION) {
				String name = inputName.getText();
				String addr = inputAddr.getText();
				MemberDto newDto = new MemberDto();
				newDto.setNum(num);
				newDto.setName(name);
				newDto.setAddr(addr);
				boolean isSuccess = dao.update(newDto);
				if (isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 성공");
					printMember();
				} else {
					JOptionPane.showMessageDialog(this, "수정 실패");
				}
			}
		});

		// 삭제 버튼 눌렀을 때 실행 할 함수 등록
		deleteBtn.addActionListener((e) -> {
			// 선택 된 row 의 index 값을 읽어온다.
			int selectedRow = table.getSelectedRow();
			// 만일 선택 된 row 가 없다면
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, " 삭제 할 Row를 선택 해 주세요!");
				return; // 메소드(함수) 를 여기서 끝내기 (리턴하기)
			}
			// 삭제 할 회원의 PRIMARY KEY 를 읽어와서
			int num = (int) model.getValueAt(selectedRow, 0);
			// DB에서 삭제
			dao.delteteByNum(num);
			// 테이블 리셋 후 DB에서 다시 불러오기
			printMember();

		});

		// 패널에 UI 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		// 패널의 배경 색 설정
		panel.setBackground(Color.orange);
		// 패널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);

		// 회원 목록을 출력 할 테이블
		table = new JTable();
		// 테이블의 칼럼 명을 배열로 미리 준비
		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 연결 할 모델 객체
		model = new DefaultTableModel();
		// 모델에 칼럼 명을 전달
		model.setColumnIdentifiers(colNames);
		model.setRowCount(0);
		// 모델 명을 테이블에 연결
		table.setModel(model);
		// 테이블의 글자 크기와 행의 높이 조절
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18));
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정

		// row 가 많은 경우 스크롤이 가능 하도록 scroll 기능 부여
		JScrollPane scroll = new JScrollPane(table);
		// 테이블에 품고 있는 JScrollPane 을 프레임의 가운데에 배치
		add(scroll, BorderLayout.CENTER);

		// sample data 를 table 에 출력하기
//		Object[] row1 = { 0, "sample name", "sample addr" };
//		model.addRow(row1);
		printMember();

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
					// ✅ 아이콘 지정해서 듀크 대신 사용
					ImageIcon icon = new ImageIcon("src/images/image_32x32.jpg");

					// this 는 나의 참조값( 나 => MemberFrame 객체 => Component type 이기도 함
					JOptionPane.showMessageDialog(MemberFrame.this, name + " 님의 정보가 저장되었습니다.", "저장 성공",
							JOptionPane.INFORMATION_MESSAGE, icon);

					inputName.setText("");
					inputAddr.setText("");
					inputName.requestFocus();
					// 테이블 리셋 후 DB에서 다시 불러오기
					printMember();
				} else {
					JOptionPane.showMessageDialog(MemberFrame.this, "저장 실패!", "에러", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
	}

	// 회원 목록을 출력하는 메소드
	public void printMember() {
		model.setRowCount(0); // 기존 테이블 비우기
		List<MemberDto> list = dao.selectAll(); // 새 데이터 불러오기
		for (MemberDto tmp : list) {
			Object[] row = { tmp.getNum(), tmp.getName(), tmp.getAddr() };
			model.addRow(row); // 테이블에 추가
		}

	}

	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
