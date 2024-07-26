package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest extends BaseClass
{
	@Test
	void LoginApp()
	{
		Reporter.log("application opened");
		Assert.assertTrue(true);

	}

}
