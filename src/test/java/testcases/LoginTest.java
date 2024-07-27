package testcases;

import java.util.logging.Logger;

//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest extends BaseClass
{
	// private static final Logger logger = LogManager.getLogger(LoginTest.class);
	public static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	@Test
	void LoginApp()
	{
		// Reporter.log("application opened");
		// logger.info("hii");
		logger.info("test is running");
		Assert.assertTrue(true);

	}

}
