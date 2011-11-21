package com.example.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class GroovySingeltonTest {

	@Test
	public void testInstanceAreEquals() throws Exception {
		assertTrue(GroovySingelton.getInstance().is(GroovySingelton.getInstance()))
	}

}
