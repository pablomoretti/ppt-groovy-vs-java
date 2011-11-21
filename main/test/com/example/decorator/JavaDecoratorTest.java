package com.example.decorator;

import org.junit.Assert;
import org.junit.Test;


public class JavaDecoratorTest {
	
	@Test
	public void testDecorator() throws Exception {
		
		JavaObjectToDecorate objectToDecorate = new JavaObjectToDecorate();
		
		JavaDecorator javaDecorator = new JavaDecorator(objectToDecorate);
		
		Assert.assertFalse(objectToDecorate.doitExecute);
		
		((JavaObjectInterface) javaDecorator).doit("foo");
		
		Assert.assertEquals("doit[foo]", javaDecorator.getLog());
		
		Assert.assertTrue(objectToDecorate.doitExecute);
		
	}

}
