package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssSelectors {
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//open website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Name
		//cssselector:tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Ajay");
		//Email
		//cssselector:tagname#idvalue
		driver.findElement(By.cssSelector("input#email")).sendKeys("a@gmail.com");
				
		//phone
		//cssSelector:tagname
		driver.findElement(By.cssSelector("input#phone")).sendKeys("9923567489");
		
		//address
		driver.findElement(By.cssSelector("textarea")).sendKeys("mg roda pune");
	
		driver.findElement(By.cssSelector("input[id='female']")).click();
		
		Select sel = new Select(driver.findElement(By.id("country")));
		sel.selectByVisibleText("India");
		
		sel.selectByIndex(3);
		Thread.sleep(1000);
		
		
				
	}

	
}
