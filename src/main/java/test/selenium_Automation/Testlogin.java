
//Test case 1: Positive LogIn test
package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin {
        public static void main(String args[]) {
        	
        	ChromeDriver driver=new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
    		//open test login page in browser
    		driver.get("https://practicetestautomation.com/practice-test-login/");
    			
    		//Type username student into Username field
    		driver.findElement(By.id("username")).sendKeys("students");
    		//driver.findElement(By.id("username")).sendKeys("student");
    		
    		//Type password Password123 into Password field
    		driver.findElement(By.id("password")).sendKeys("Password123");
    		//driver.findElement(By.name("password")).clear();
    		//driver.findElement(By.name("password")).sendKeys("Password123 ");
    		
    		//Push Submit button
    		driver.findElement(By.id("submit")).click();
    		
    		//Verify error message is displayed
    		
    		
        }
}
