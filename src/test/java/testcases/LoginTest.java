package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest extends BaseClass
{
	public static final Logger logger = LogManager.getLogger(LoginTest.class);

	@Test
	void LoginApp()
	{
		// Reporter.log("application opened");
		logger.info("hii");
		Assert.assertTrue(true);

	}

}
