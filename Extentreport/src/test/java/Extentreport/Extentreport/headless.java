package Extentreport.Extentreport;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headless {
	
	@Test
	public void testheadless() throws InterruptedException
	{
		WebDriver driver= new HtmlUnitDriver();
				// open facebook webpage
				driver.get("http://www.facebook.com");
				 
				// Print the title
				System.out.println("Title of the page "+ driver.getTitle());
				 
				// find the username field
				WebElement username = driver.findElement(By.id("email"));
				 
				// enter username
				username.sendKeys("rahulagrawal.50@gmail.com");
				 
				// find the password field
				WebElement password = driver.findElement(By.id("pass"));
				 
				// Click the loginbutton
				password.sendKeys("pjs@903998");
				 
				// find the Sign up button
				WebElement Signup_button = driver.findElement(By.id("loginbutton"));
				 
				// Click the loginbutton
				Signup_button.click();
				 
				// wait for 5 second to login
				Thread.sleep(5000);
				 
				// You will get new title after login
				System.out.println("After login title is = " + driver.getTitle());
				
	}

}
