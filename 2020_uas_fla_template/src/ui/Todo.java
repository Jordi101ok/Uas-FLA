package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Todo extends JPanel {
	private Border border;
	private JLabel label;
	private JCheckBox checkbox;
	private Todos todos;

	public Todo(String text){
		this.setPreferredSize(new Dimension(350, 30));

		border = BorderFactory.createLineBorder(Color.BLACK, 1);
		this.setBorder(border);

		this.setLayout(new BorderLayout());

		checkbox = new JCheckBox();
		this.add(checkbox, BorderLayout.WEST);

		label = new JLabel(text);
		this.add(label, BorderLayout.CENTER);

	}
	
	public JCheckBox getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(JCheckBox checkbox) {
		this.checkbox = checkbox;
	}

	public boolean isChecked() {
		return checkbox.isSelected();
	}

}
