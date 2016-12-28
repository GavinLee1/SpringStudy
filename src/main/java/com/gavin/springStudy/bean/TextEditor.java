package com.gavin.springStudy.bean;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker)
	{
		this.spellChecker = spellChecker;
	}
	
	public void checkSpell()
	{
		spellChecker.checkSpelling();
	}
}
