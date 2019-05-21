package net.mynym.SysCred;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TransitionTable {
	private Map<String, Transition> transitions = new HashMap<>();
	public void put(Transition transition) {
		transitions.put(transition.fromState.name, transition);
	}
	
	@JsonIgnore
	public Transition get(String name) {
		return transitions.get(name);
	}
	
	@JsonIgnore
	public Set<String> getTransitionFromStates() {
		return transitions.keySet();
	}
	
	public Map<String, Transition> getTransitions() {
		return transitions;
	}
	

}
