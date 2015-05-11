package com.unitTest;

import com.model.Person;

public class NGTest extends BaseTestCase {

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