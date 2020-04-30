package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGClass 
{
	@BeforeSuite
	public void BeforeSuiteanno()
	{
		System.out.println("TestNG FrameWork Annotation - @BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("TestNG FrameWork Annotation - @BeforeTest");
	}
	
	@BeforeClass	
	public void BeforeClassanno()
	{
		System.out.println("TestNG FrameWork Annotation - @BeforeClass");
	}
	
	@BeforeMethod	
	public void BeforeMethodanno()
	{
		System.out.println("TestNG FrameWork Annotation - @BeforeMethod");
	}
	
	@Test
		public void test()
		{
			System.out.println("TestNG FrameWork Annotation - @Test");
		}
	
	@AfterMethod	
	public void AfterMethodanno()
	{
		System.out.println("TestNG FrameWork Annotation - @AfterMethod");
	}
	
	
	@AfterClass
	public void AfterClassanno()
	{
		System.out.println("TestNG FrameWork Annotation - @AfterClass");
	}
	
	@AfterTest
	public void Aftertestanno()
	{
		System.out.println("TestNG FrameWork Annotation - @AfterTest");
	}
	
	@AfterSuite
	public void AfterSuiteanno()
	{
		System.out.println("TestNG FrameWork Annotation - @AfterSuite");
	}
	
}
