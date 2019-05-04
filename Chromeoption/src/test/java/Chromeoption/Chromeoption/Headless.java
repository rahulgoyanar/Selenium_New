package Chromeoption.Chromeoption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Headless {
	
	public static void main(String[] args) {
		
	
		
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		//option.addArguments("disable-infobars");
		option.setAcceptInsecureCerts(true);
		WebDriver d=new ChromeDriver(option);
		d.get("https://www.amazon.com");
		System.out.println(d.getTitle());
		
		
	}

}
