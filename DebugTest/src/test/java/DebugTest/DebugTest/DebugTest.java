package DebugTest.DebugTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DebugTest {

	 WebDriver driver = null;

	@Test
	public void login() {
		System.setProperty("webdriver.ie.driver", "D://IDM DOWNLOAD//IEDriverServer.exe");

	   driver = new InternetExplorerDriver();

		driver.get("http://learn-automation.com");
		String title = driver.getTitle();
		System.out.println(title);
		 Assert.assertFalse(title.contains("webdriver"));
	}	

	@Test
	public void Logout() {

		driver.quit();
	}


}