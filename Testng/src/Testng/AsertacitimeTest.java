package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AsertacitimeTest {
	@BeforeClass
	public void configbeforeclass()
	{
		System.out.println("launche browser initialize");
	}
	@BeforeMethod
	public void configbeforemtd()
	{
		System.out.println("login");
	}
	
	@Test
	public void createcustomerTest(){
		System.out.println("create and verify customer");
	}
	@Test()
	public void modifycustomerTest(){
		System.out.println("modyfy customer");
	}
	@AfterMethod
	public void configaftermtd(){
		System.out.println("logout");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest()");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest()");
	}
	@AfterClass
	public void configafterclass(){
		System.out.println("-----.........-----------close browser........-----------");
	}
	

}
