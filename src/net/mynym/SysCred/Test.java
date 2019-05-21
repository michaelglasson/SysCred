package net.mynym.SysCred;

import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// Read states
		
		// Read actions
		
		// Read transition table
		
		Action a = new Action("One", "First thing");
		Action b = new Action("Two", "Second thing");
		State A = new State("A", "Alpha");
		State B = new State("B", "Bravo");
		Transition t1 = new Transition(A, B, a);
		Transition t2 = new Transition(B, A, b);
		
		TransitionTable t = new TransitionTable();
		t.put(t1);
		t.put(t2);
		
		ObjectMapper mapper = new ObjectMapper();
		
		FileOutputStream fileOutputStream = new FileOutputStream("transitionTable1.json");
	      mapper.writerWithDefaultPrettyPrinter().writeValue(fileOutputStream, t);
	      fileOutputStream.close();
	}

}
