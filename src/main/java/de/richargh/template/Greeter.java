package de.richargh.template;

public class Greeter {

	private final String name;

	public Greeter(String name){
		this.name = name;
	}

	public String speak(){
		return name;
	}
}
