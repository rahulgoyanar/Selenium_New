package log4JForSelenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLog4J extends TestBase{
	WebDriver driver;
	private static final Logger logger = Logger.getLogger(TestLog4J.class.getName());
	
	@Test
	public void testLogin(){
		logger.info("staring login test");
		System.setProperty("WebDriver.gecko.driver",
				"D:\\IDM DOWNLOAD\\Programs\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		logger.info("clicked on sign in button");
		driver.findElement(By.name("email")).sendKeys("usn");
		driver.findElement(By.name("pass")).sendKeys("pwd");

		logger.info("enter user name");
		logger.info("enter password");
		driver.quit();
		logger.info("click on submit button");
	}

}
