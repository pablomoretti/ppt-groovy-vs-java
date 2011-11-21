package com.example.resources;

import org.junit.Assert;
import org.junit.Test;

public class JavaResourcesTest {

	@Test
	public void testReleaseResource() throws Exception {

		JavaResources javaResources = null;

		try {

			javaResources = new JavaResources();

			javaResources.doit(false);
		
		} catch (Exception e) {
			
			
		} finally {
			if (javaResources != null)
				javaResources.release();
		}

		Assert.assertTrue(javaResources.isRelease());

	}

	@Test
	public void testReleaseResourceException() throws Exception {

		JavaResources javaResources = null;

		try {

			javaResources = new JavaResources();

			javaResources.doit(true);
		
		} catch (Exception e) {
			
			
		} finally {
			if (javaResources != null)
				javaResources.release();
		}

		Assert.assertTrue(javaResources.isRelease());

	}
}
