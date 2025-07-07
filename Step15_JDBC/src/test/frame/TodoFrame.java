package test.frame;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import test.dao.TodoDao;
import test.dto.TodoDto;

public class TodoFrame extends JFrame {
	JTextField inputTodo;
	JTable table;
	DefaultTableModel model;
	TodoDao dao = new TodoDao();

	public TodoFrame() {
		setTitle("To-Do List 🔏");
		setLayout(new BorderLayout());
		setBounds(100, 100, 800, 500);

		inputTodo = new JTextField(20);
		JButton addBtn = new JButton("추가 ➕ ");
		JButton delBtn = new JButton("삭제 ❌ ");
		JButton doneBtn = new JButton("완료 ✅ ");

		JPanel panel = new JPanel();
		panel.add(new JLabel("오늘 해야 할 일은 무엇인가요? : "));
		panel.add(inputTodo);
		panel.add(addBtn);
		panel.add(delBtn);
		panel.add(doneBtn);
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel, BorderLayout.NORTH);

		String[] colNames = { "번호", "할 일", "완료" };
		model = new DefaultTableModel(colNames, 0);
		table = new JTable(model);
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16));
		table.setRowHeight(25);
		add(new JScrollPane(table), BorderLayout.CENTER);

		printTodos();

		addBtn.addActionListener(e -> {
			String content = inputTodo.getText().trim();
			if (!content.isEmpty()) {
				TodoDto dto = new TodoDto();
				dto.setContent(content);
				dao.insert(dto);
				inputTodo.setText("");
				printTodos();
			}
		});

		delBtn.addActionListener(e -> {
			int row = table.getSelectedRow();
			if (row != -1) {
				int num = (int) model.getValueAt(row, 0);
				dao.delete(num);
				printTodos();
			}
		});

		doneBtn.addActionListener(e -> {
			int row = table.getSelectedRow();
			if (row != -1) {
				int num = (int) model.getValueAt(row, 0);
				dao.updateDone(num, "Y");
				printTodos();
			}
		});
	}

	public void printTodos() {
		model.setRowCount(0);
		List<TodoDto> list = dao.selectAll();
		for (TodoDto dto : list) {
			String doneKor = "진행중";
			if ("Y".equals(dto.getDone()))
				doneKor = "완료";
			Object[] row = { dto.getNum(), dto.getContent(), doneKor };
			model.addRow(row);
		}
	}

	public static void main(String[] args) {
		new TodoFrame().setVisible(true);
	}
}
