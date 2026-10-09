//Test case 3: Negative password test
package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Neg_passtest {
	public static void main() {
		
		
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		
		d.findElement(By.id("username")).sendKeys("student");
		
		d.findElement(By.id("password")).sendKeys(" incorrectPassword ");
		
		d.findElement(By.id("submit")).click();

	}

}
