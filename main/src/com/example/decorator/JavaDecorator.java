package com.example.decorator;

import java.util.ArrayList;

public class JavaDecorator implements JavaObjectInterface {

	private JavaObjectInterface objectInterface;
	
	private StringBuilder log = new StringBuilder();
	
	public JavaDecorator(JavaObjectInterface objectInterface) {
		this.objectInterface = objectInterface;
	}

	public void doit(String text) {
		log.append("doit[" + text+"]");
		objectInterface.doit(text);
	}
	
	public String getLog(){
		return log.toString();
	}
	
}

interface JavaObjectInterface {
	public void doit(String text);
}

class JavaObjectToDecorate implements JavaObjectInterface {
	
	public Boolean doitExecute = false;
	
	public void doit(String text) {
		doitExecute = true;
	}

}


