package mediator;

import state.StateAllUnchecked;
import state.StateAtLeastOneChecked;
import ui.TodoFrame;
import ui.Todos;

public class Mediator {

	public Mediator(TodoFrame frameTodos) {
		// TODO Auto-generated constructor stub
		if(frameTodos.getterState() instanceof StateAllUnchecked) {
			return;
		}
		if(frameTodos.getterState() instanceof StateAtLeastOneChecked) {
			return;
		}
	}

}
