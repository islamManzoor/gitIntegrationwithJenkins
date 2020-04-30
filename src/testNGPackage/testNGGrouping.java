package testNGPackage;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class testNGGrouping {
	
	@Test(groups= {"functional"})
	public void Login()
	{
		System.out.println("Login Successfully!");
		assertTrue(1>2);
	}
	
	@Test(groups= {"performance", "regression"})
	public void Quote()
	{
		System.out.println("Inventory Fetched Successfully!");
		throw new SkipException("Skipping - This is not ready for testing ");
	}
	
	@Test(groups= {"functional"})
	public void Cancel()
	{
		System.out.println("Cancel Successfully & refund 100%!");
	}
	
	@Test(groups= {"functional"})
	public void Logout()
	{
		System.out.println("Logout Successfully!");
	}

}
