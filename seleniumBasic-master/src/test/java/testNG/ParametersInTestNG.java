package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	@Test
	@Parameters({"userName","password"})
	public void testLogin(String userName,String password){
		System.out.println("userName is:-"+userName+" passowrd:-"+password);
	}

}
