package test.selenium_Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dataenteryform_xpath {
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Name
		//xpath:tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ajay");
		//Email
		//xpath:tagname[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@class='form-control' and @id='email']")).sendKeys("a@gmail.com");
		
		//phone
		//xpath:tagname[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@type='text' and @id='phone']")).sendKeys("9923456789");
		
		//address
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("pune");
		
		//Gender
		//tagname[ends-with(@attribute,'value')] 
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		//Days
		//handling multiple webelements
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-label']"));
		Iterator<WebElement> it=checkboxes.iterator();
		
		while(it.hasNext())
		{
			WebElement check=it.next();
			check.click();
			Thread.sleep(1000);
			
		}
		
		Select sel = new Select(driver.findElement(By.id("country")));
		sel.selectByVisibleText("India");
		
		sel.selectByIndex(3);
		Thread.sleep(1000);
		
		
		
		
	}
	

}
