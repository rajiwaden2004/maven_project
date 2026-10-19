package test.selenium_Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class all_annotations {
	
	
	@AfterTest
	public void name() {
		System.out.println("@AfterTest");
	}
	
	@Test
	public void email() {
		System.out.println("@Test");
	}
	
	@BeforeTest
	public void surname() {
		System.out.println("@BeforeTest");
	}
	
	@AfterSuite
	public void contact() {
		System.out.println("@AfterSuite");
	}
	
	@BeforeClass
	public void address() {
		System.out.println("@BeforeClass");
	}
	
	@AfterMethod
	public void edu() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void course() {
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	public void city() {
		System.out.println("@BeforeMethod");
	}
	 @BeforeSuite
	public void location() {
		System.out.println("BeforeSuite");
	}

}
