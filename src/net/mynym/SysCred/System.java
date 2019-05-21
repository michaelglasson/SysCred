package net.mynym.SysCred;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public class System {
	public String id;
	public String name;
	public final Set<System> children = new LinkedHashSet<>();

	// Use this one to create object in program
	public System newChild(String name) {
		System child = new System();
		child.id = UUID.randomUUID().toString();
		child.name = name;
		children.add(child);
		return child;
	}
}
