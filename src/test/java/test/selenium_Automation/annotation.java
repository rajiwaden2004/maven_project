package test.selenium_Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	
	@AfterTest
	public void name() {
		System.out.println("Neha");
	}
	
	@Test
	public void email() {
		System.out.println("n@gmail.com");
	}
	
	@BeforeTest
	public void surname() {
		System.out.println("Rajiwade");
	}

}
