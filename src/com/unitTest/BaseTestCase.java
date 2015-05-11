package com.unitTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;

public class BaseTestCase extends TestCase {
	
	protected static Log log = null;
	
	private static String ACER_UNITTEST_PREFIX = "com.unitTest.";
	private static String ACER_PREFIX = "com.";

	protected boolean tracing = false;

	public BaseTestCase(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		log = LogFactory.getLog(this.getClass());
		log.info("=== " + getTestName() + " RUN ===");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private String getTestName() {
		//String module = null;
		String testClass = getClass().getName();
		String testName = getName();

		if (testClass.startsWith(ACER_UNITTEST_PREFIX)) {
			testClass = testClass.substring(ACER_UNITTEST_PREFIX.length());
		} else if (testClass.startsWith(ACER_PREFIX)) {
			testClass = testClass.substring(ACER_PREFIX.length());
		}
//		{
//			int idx = testClass.indexOf('.');
//			module = testClass.substring(0, idx).toUpperCase();
//			testClass = testClass.substring(idx + 1);
//		}
//		
//		return module + "." + testClass + "." + testName;
		return testClass + "." + testName;
	}

	protected String getTestDetails() {
		return "";
	}

	public void runBare() throws Throwable {
		String testName = getTestName();

		// int testResult = TestLog.PASSED;
		// long startTime = System.currentTimeMillis();
		try {
			super.runBare();
			log.info("=== " + testName + " PASSED ===");
		} catch (Throwable e) {
			//System.out.println(testName + getTestDetails() + " error: " + e.getMessage());
			//e.printStackTrace();
			log.error("=== " + testName + getTestDetails() + " FAILURE! ===", e);
			if (tracing) {
				e.printStackTrace();
			}
			// if (ExpectedFailures.isTestExpectedToFail(testName))
			// testResult = TestLog.EXPECTED_FAILURE;
			// else
			// testResult = TestLog.FAILED;
			throw e;
		} finally {
			// long endTime = System.currentTimeMillis();
			// TestLog.report(testName + getTestDetails(), testResult, startTime, (endTime-startTime));
		}
	}

	// Use these instead of assertTrue to get better output when something fails:
	public static void assertContains(String haystack, String needle) {
		if (haystack.contains(needle)) {
			// PASS
		} else {
			fail("Search string \"" + needle + "\" was not found in \"" + haystack + "\"");
		}
	}

	public static void assertGreater(long actual, long expected) {
		if (actual > expected) {
			// PASS
		} else {
			fail(actual + " was not greater than " + expected);
		}
	}

	public static void assertGreaterOrEqual(long actual, long expected) {
		if (actual >= expected) {
			// PASS
		} else {
			fail(actual + " was not >= " + expected);
		}
	}

	public static void assertGreaterOrEqual(long actual, long expected, String msg) {
		if (actual >= expected) {
			// PASS
		} else {
			fail(actual + " was not >= " + expected + ": " + msg);
		}
	}
	
	public static void assertNotEmpty(String message, String actual) {
		if (actual == null) {
			fail(message + " was null");
		} else if (actual.length() == 0) {
			fail(message + " was empty");
		} else {
			// PASS
		}
	}

	public static void assertNotEmpty(String s) {
		if (s == null) {
			fail("string was null");
		} else if (s.length() == 0) {
			fail("string was length 0");
		} else {
			// PASS
		}
	}
}