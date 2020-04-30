package testNGPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
	@Parameters("email")
	@Test
	public void Login(String email)
	{
		System.out.println("Login Successfully");
		System.out.println(email);
	}

}
