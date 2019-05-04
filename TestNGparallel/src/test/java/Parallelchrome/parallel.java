package Parallelchrome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel {
	@Test
	 public void getFirefox(){
	                //System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
	 System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
	                System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.SoftwareTestingMaterial.com");
	 driver.close();
	 }

}
