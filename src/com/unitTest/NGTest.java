package com.unitTest;

import com.model.Person;

import junit.framework.TestCase;

public class NGTest extends TestCase {

	public NGTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void test() throws Throwable {
		try {
			Person person = new Person("Eason");
			assertEquals("Jason", person.getName());
		} finally {
		}
	}
}