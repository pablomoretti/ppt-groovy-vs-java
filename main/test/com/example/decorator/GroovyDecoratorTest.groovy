package com.example.decorator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

class GroovyDecoratorTest {
	
	@Test
	public void testDecorator() throws Exception {
		
		GroovyObjectToDecorate objectToDecorate = new GroovyObjectToDecorate();
		
		GroovyDecorator groovyDecorator = new GroovyDecorator(objectToDecorate);
		
		Assert.assertFalse(objectToDecorate.doitExecute);
		
		groovyDecorator.doit("foo");
		
		Assert.assertEquals("doit[foo]", groovyDecorator.getLog());
		
		Assert.assertTrue(objectToDecorate.doitExecute);
		
	}

}
