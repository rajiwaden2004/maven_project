package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draganddrop {
	public static void main(String[] args) {
		
		//initialize the weddrive
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//drag
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//drop
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//action class = handle to mouseover or keyboard actions
		
		
		
	}

}
