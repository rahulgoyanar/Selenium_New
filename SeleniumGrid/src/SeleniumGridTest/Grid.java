package SeleniumGridTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class Grid {
	public void runFirefoxTest() throws MalformedURLException,InterruptedException {
//System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		// We have to mention browser which we want to use for test execution
		DesiredCapabilities cap = new DesiredCapabilities();

		// Set the platform where we want to run our test- we can use MAC and
		cap.setBrowserName(BrowserType.CHROME);
		cap.setPlatform(Platform.LINUX);
		

		// Here you can use hub address, hub will take the responsibility to
		// execute the test on respective node
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4546/wd/hub"),cap);
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Create driver with hub address and capability

		// start application
		driver.get("http://learn-automation.com/");

		// get the title and print the same
		System.out.println("Blog title is " + driver.getTitle());

		driver.close();

	}

}
