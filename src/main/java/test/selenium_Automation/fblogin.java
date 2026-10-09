package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.facebook.com/");
		
		//findout the email textbox
		driver.findElement(By.id("email")).sendKeys("fct@gmail.com");
		
		//findout the password textbox
		driver.findElement(By.id("pass")).sendKeys("Fct@123");
		
		//findout the login textbox
		driver.findElement(By.id("loginbutton")).click();
		
		//locater:name
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("Neha@gmail.com");
		
		
	}

}
