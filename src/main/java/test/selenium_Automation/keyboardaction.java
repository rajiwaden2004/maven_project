package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardaction {
	public static void main (String args[]) {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	//open the website
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	search.sendKeys("Mobile");

	//enetr
	search.sendKeys(Keys.ENTER);
	
	//copy
	driver.navigate().to("https://demo.automationtesting.in/Register.html");
	
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("Neha");
	
	//seelct Firstname
	firstname.sendKeys(Keys.CONTROL+"A");
	
	//copy firstname
	firstname.sendKeys(Keys.CONTROL+"C");
	
	//paste firstname
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys(Keys.CONTROL+"V");
}
}
