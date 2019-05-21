package net.mynym.SysCred;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "name")
@JsonIdentityReference(alwaysAsId=true)
public class Action {
	public String name;
	public String description;
	
	public Action() {}
	
	public Action(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
