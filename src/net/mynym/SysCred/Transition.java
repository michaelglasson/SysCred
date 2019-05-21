package net.mynym.SysCred;

public class Transition {
	public State fromState;
	public State toState;
	public Action action;
	
	public Transition() {}
	public Transition(State fromState, State toState, Action action) {
		this.fromState = fromState;
		this.toState = toState;
		this.action = action;
	}

}
