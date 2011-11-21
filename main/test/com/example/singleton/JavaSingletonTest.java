package com.example.singleton;

import org.junit.Assert;
import org.junit.Test;

public class JavaSingletonTest {

	@Test
	public void testInstanceAreEquals() throws Exception {
		Assert.assertTrue(JavaSingleton.getInstance() == JavaSingleton.getInstance());
	}
}
