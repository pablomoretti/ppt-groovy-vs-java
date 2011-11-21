package com.example.singleton;

import org.junit.Assert;
import org.junit.Test;

public class JavaSingeltonTest {

	@Test
	public void testInstanceAreEquals() throws Exception {
		Assert.assertTrue(JavaSingelton.getInstance() == JavaSingelton.getInstance());
	}
}
