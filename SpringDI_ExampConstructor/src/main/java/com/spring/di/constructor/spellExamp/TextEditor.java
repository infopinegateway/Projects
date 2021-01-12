package com.spring.di.constructor.spellExamp;

public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {		
		System.out.println("Inside TextEditor SpellChecker Argumented Constructor." );
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() { spellChecker.checkSpelling(); }

}
