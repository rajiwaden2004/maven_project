package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handling {
	public static void main(String args[]) {
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Neha");
		
		
	}

}
