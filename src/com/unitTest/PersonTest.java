package com.unitTest;

import com.model.Person;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public PersonTest(String name) {
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
			assertEquals("Eason", person.getName());
			
//			Person person2 = new Person("Eason2");
//			assertEquals("Eason", person2.getName());
		} finally {
		}
	}
}