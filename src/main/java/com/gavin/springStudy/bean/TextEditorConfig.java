package com.gavin.springStudy.bean;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
	@Bean
	public TextEditor getTextEditor()
	{
		return new TextEditor(getSpellChecker());
	}
	
	@Bean
	public SpellChecker getSpellChecker()
	{
		return new SpellChecker();
	}
}
