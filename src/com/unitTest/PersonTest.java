package com.unitTest;

import com.model.Person;

public class PersonTest extends BaseTestCase {
	
	public PersonTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testName() throws Throwable {
		try {
			Person person = new Person("Eason");
			assertEquals("Eason", person.getName());
			
//			Person person2 = new Person("Eason2");
//			assertEquals("Eason", person2.getName());
		} finally {
		}
	}
	
	public void testEnv() throws Throwable {
//		Set keys = System.getenv().keySet();
//		for (Object key : keys) {
//			log.info("key = " + key);
//		}
		
		String INGY_ENV = System.getenv("INGY_ENV");
		assertEquals("INGY_ENV", "dev", INGY_ENV);		
	}
}