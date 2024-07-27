package testcases;

import java.util.logging.Logger;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest extends BaseClass
{

	// Initialized log4j Logger
	// public static final Logger logger = LogManager.getLogger(LoginTest.class);

	// Initialized Java's Built-in logger
	// package used- import java.util.logging.Logger;
	public static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	@Test
	void LoginApp()
	{
		// Reporter.log("application opened"); //testng inbuilt logger
		logger.info("test is running"); // Java's Built-in Logging API
		Assert.assertTrue(true);

	}

}
