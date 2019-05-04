package Parallelfirefox;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelchrm {
	@Test
	 public void getChorme(){
	                //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
	 System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
	                System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.SoftwareTestingMaterial.com");
	 driver.close();
	 }

}
