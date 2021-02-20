package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import mediator.Mediator;
import state.State;

public class TodoFrame extends JFrame implements ActionListener{
	private TodoInput todoInput;
	private Todos todos;
	private Actions actions;
	protected State state;
	private Todo todo;
	protected Mediator mediator;
	public int doneCounter = 0;

	public TodoFrame() {
		this.setTitle("Done: 0");

		todoInput = new TodoInput(this);
		this.add(todoInput, BorderLayout.NORTH);

		todos = new Todos(this);
		this.add(todos, BorderLayout.CENTER);

		actions = new Actions(this);
		this.add(actions, BorderLayout.SOUTH);
		
		todo.getCheckbox().addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
	
	public State getterState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void addTodo(String text) {
		todos.addTodo(text);
		this.pack();
	}

	public void doneTodos() {
		todos.done();
		this.pack();
	}

	public void removeTodos() {
		todos.remove();
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mediator = new Mediator (this);
	}
}
