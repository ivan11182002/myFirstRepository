package com.tutorialspoint.autowiring.byconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("awTextEditorByConstructor");
		
		System.out.println("=== auto wiring by constructor ===");
		
		te.getName();
		te.spellCheck();
		
		context.close();
	}

}
