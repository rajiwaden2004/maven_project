package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {
	public static void main(String args []) {
		
		EdgeDriver driver = new EdgeDriver();
		
		//Open the page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		driver.findElement(By.className("btn")).click();
		
		//Verify new page URL contains practicetestautomation.com/logged-in-successfully/
		System.out.println("URL after login :"+driver.getCurrentUrl());
		
		//Verify new page contains expected text ('Congratulations' or 'successfully logged in')
		WebElement greet_text=driver.findElement(By.tagName("strong"));
		System.out.println("Greet Text after login:"+greet_text.getText());
		
		//Verify button Log out is displayed on the new page
		WebElement islogout=driver.findElement(By.linkText("Log out"));
		System.out.println("LogOut Text:"+islogout.getText());
	}

}
