package com.example.resources;

import static org.junit.Assert.*
import static GroovyResources.executeAndRelease

import org.junit.Test

class GroovyResourcesTest {

	@Test
	public void testReleaseResource() throws Exception {
		
		GroovyResources groovyResources = new GroovyResources()
		
		executeAndRelease(groovyResources){
			doit(false)
		}
		
		assertTrue(groovyResources.hasUse())
		
	}

	@Test
	public void testReleaseResourceException() throws Exception {
		
		GroovyResources groovyResources = new GroovyResources()
		
		try {
			
			executeAndRelease(groovyResources){
				doit(true)
			}
			
		} catch (Exception e) {
		
		}
		
		assertTrue(groovyResources.hasUse())
	}
}
