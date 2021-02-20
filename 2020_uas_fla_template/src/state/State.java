package state;

import ui.TodoFrame;

public abstract class State {
	
	protected TodoFrame frameTodo;

	public State(TodoFrame frameTodo) {
		super();
		this.frameTodo = frameTodo;
	}

	public abstract void changeState();
		
}
