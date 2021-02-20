package ui;

import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Todos extends JPanel {
	private TodoFrame frame;
	public int doneCounter = 0;
	
	private Vector<Todo> todos;

	public Todos(TodoFrame frame) {
		this.frame = frame;
		this.todos = new Vector<>();

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		displayTodos();
	}

	public void addTodo(String text) {
		todos.add(new Todo(text));
		displayTodos();
	}

	public void done() {
		Vector<Todo> newTodos = new Vector<>();
		for (Todo todo : todos) {
			if (todo.isChecked()) {
				doneCounter++;
				continue;
			}
			newTodos.add(todo);
		}
		frame.doneCounter = this.doneCounter;
		this.todos = newTodos;
		displayTodos();
	}

	public void remove() {
		Vector<Todo> newTodos = new Vector<>();
		for (Todo todo : todos) {
			if (todo.isChecked()) {
				continue;
			}
			newTodos.add(todo);
		}
		this.todos = newTodos;
		displayTodos();
	}
	
	private void displayTodos() {
		removeAll();
		for (Todo todo : todos) {
			this.add(todo);
		}
	}

	public Vector<Todo> getTodos() {
		return todos;
	}

	public void setTodos(Vector<Todo> todos) {
		this.todos = todos;
	}
}
