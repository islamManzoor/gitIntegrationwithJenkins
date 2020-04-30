package testNGPackage;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class testNGListeners extends TestListenerAdapter{
	
	public void onTestSuccess(ITestResult tr)
	{
	System.out.println("Message By Listener - Test Case Passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Message By Listener - Test Case Failed");	
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Message By Listener - Test Case Skipped");
	}
}
