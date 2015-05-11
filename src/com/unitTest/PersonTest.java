package com.unitTest;

import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.model.Person;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	protected Log log = null;
	
	public PersonTest(String name) {
		super(name);
		log = LogFactory.getLog(PersonTest.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void test() throws Throwable {
		try {
			
			Set keys = System.getenv().keySet();
			for (Object key : keys) {
				log.info("key = " + key);
			}
			
			String INGY_ENV = System.getenv("INGY_ENV");
			assertEquals("INGY_ENV", "dev", INGY_ENV);
			
			Person person = new Person("Eason");
			assertEquals("Eason", person.getName());
			
//			Person person2 = new Person("Eason2");
//			assertEquals("Eason", person2.getName());
		} finally {
		}
	}
}