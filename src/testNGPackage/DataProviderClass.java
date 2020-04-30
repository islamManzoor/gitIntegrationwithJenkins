package testNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider = "testData")
	public void test(String FirstName, String LastName, String Email,String Password)
	{
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(Password);		
	}

	@DataProvider
	public Object[][] testData(){
	Object[][] obj = new Object[3][4];
	
	obj[0][0] = "Islam";
	obj[0][1] = "Manzoor";
	obj[0][2] = "islam@gmail.com";
	obj[0][3] = "test123";
	
	obj[1][0] = "Hashir";
	obj[1][1] = "Islam";
	obj[1][2] = "hashir@gmail.com";
	obj[1][3] = "test122";
	
	obj[2][0] = "Moiz";
	obj[2][1] = "Islam";
	obj[2][2] = "moiz@gmail.com";
	obj[2][3] = "test121";
			
	
	return obj;
	}
}
