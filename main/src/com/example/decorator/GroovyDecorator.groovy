package com.example.decorator;

public class GroovyDecorator {

	StringBuilder log = new StringBuilder()

	private delegate

	GroovyDecorator(delegate) {
		this.delegate = delegate
	}

	def invokeMethod(String name, args) {
		log.append(name + args)
		delegate.invokeMethod(name, args)
	}

	def getLog(){
		log.toString()
	}
}

class GroovyObjectToDecorate  {

	public Boolean doitExecute = false;

	public void doit(String text) {
		doitExecute = true;
	}
}
