package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//mousehover
		WebElement pointmebtn = driver.findElement(By.xpath("//button[@text()='Point Me']"));
		
		Actions ac = new Actions(driver);
		
		
		ac.moveToElement(pointmebtn).build().perform();
		
		
		
	}

}
