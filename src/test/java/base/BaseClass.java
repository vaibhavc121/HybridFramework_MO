package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	WebDriver driver;

	@BeforeClass
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
