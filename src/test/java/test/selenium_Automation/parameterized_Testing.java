package test.selenium_Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized_Testing {
	@Test
	@Parameters({"P"})
	public void dispaly_number(int num) {
		System.out.println("number is:"+num);
	}

}
