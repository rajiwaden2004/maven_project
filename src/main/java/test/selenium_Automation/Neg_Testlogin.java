
//Test case 2: Negative username test
package test.selenium_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Neg_Testlogin {
	public static void main(String[]args) {
		
		//create a object of EdgeDriver
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Open page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//Type username incorrectUser into Username field
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		
		//Type password Password123 into Password field
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//Push Submit button
		driver.findElement(By.id("submit")).click();
		
		//error massage display (Your username is invalid!)
	}

}
