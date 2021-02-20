package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TodoInput extends JPanel implements ActionListener {
	private TodoFrame frame;
	private JTextField text;
	private JButton add;
	private JButton add2;

	public TodoInput(TodoFrame frame) {
		this.frame = frame;
		
		text = new JTextField(20);
		add = new JButton("Add");
		add2 = new JButton("Add2");
		
		this.add(text);
		this.add(add);
		this.add(add2);
		
		add2.addActionListener(this);
		add.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		if (!e.getSource().equals(add)) {
//			return;
//		}

		String todoText = this.text.getText();
		frame.addTodo(todoText);

		this.text.setText("");
		
		
		
	}
}
