package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name="data")
	public Object[][] dataProviderTest(){
		//return new Object[][]{{"userName","passowrd"},{"userName","passowrd"},{"userName","passowrd"}};
        Object[][] obj = new Object[2][2];
		
		obj[0][0]="userName1";
		obj[0][1]="passowrd1";
		
		obj[1][0]="userName2";
		obj[1][1]="passowrd2";
	
		
		return obj;
	}

	@Test(dataProvider ="data")
	public void test(String a, String b) {
		System.out.println("userName-- "+ a + "     passowrd--" +b);
		
	}
	


}
