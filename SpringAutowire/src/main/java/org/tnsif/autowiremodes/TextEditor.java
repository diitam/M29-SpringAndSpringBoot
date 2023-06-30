package org.tnsif.autowiremodes;

public class TextEditor {

	//DI in form of objects
	private SpellChecker checker;
	
	
	//constructor
	public TextEditor(SpellChecker checker) {
		super();
		this.checker = checker;
		System.out.println("Dependency injetion using constructor");
	}

	//Getters and Setters
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}

	
	public void display()
	{
		checker.checkSpelling();
	}
	
	
}
