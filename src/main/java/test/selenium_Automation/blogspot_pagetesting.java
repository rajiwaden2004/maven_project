package test.selenium_Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blogspot_pagetesting {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the WEBSITE
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Assign the name field
		//Syntx:xpath:(By.xpath("//taganme[@attribute='value']"));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Neha");
		
		//Assign the emailid
		//Syantx:xpath:(By.xpath("//tagname[@attribute='value' and @attribute='value']));
		driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("n@gmail.com");
		
		//ASSIGN THE PHONE NUMBER
		//Syantx:xpath:(By.xpath("//tagname[@attribute='value' and @attribute='value']));
		driver.findElement(By.xpath("//input[@class='form-control' and @id='phone']")).sendKeys("9943675423");
		
		//Assign the address field
		//Syntax:xpath:(By.xpath("//taganme[@attribute='value']");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Pune,Maharashtra");
		
		//Assign the radio button for(Gender)
		//syntax:xpath:(By.id("value"));
		driver.findElement(By.id("female")).click();
		
		//Assign the checkbox for (days)
		//Syntax:xpath:(By.xpath("//taganme[contains(@attribute,value)]");
		//driver.findElement(By.xpath("//div[contains(@class,'form-check form-check-inline')")).click();
		
		//day-sunday
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
	//	Thread.sleep(1000);
		
		//day-monday
		//driver.findElement(By.id("monday")).click();
		//Thread.sleep(1000);
		
		//day-tuesday
		//driver.findElement(By.id("tuesday")).click();
		//Thread.sleep(1000);
		
		//day-wednesday
		//driver.findElement(By.id("wednesday")).click();
		//Thread.sleep(1000);
		
		//day-thursday
		//driver.findElement(By.id("thursday")).click();
		//Thread.sleep(1000);
		
		//day-friday
		//driver.findElement(By.id("friday")).click();
		//Thread.sleep(1000);
		
		//day.saturday
		//driver.findElement(By.id("saturday")).click();
		
		//handling of checkbox == using the list
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-label']"));
		Iterator<WebElement> it=checkboxes.iterator();
				
			while(it.hasNext())
			{
				WebElement check=it.next();
				check.click();
				Thread.sleep(1000);
					
			}
		
		//Assign the country
		//Select the country using the select
		Select sc = new Select(driver.findElement(By.id("country")));
		sc.selectByIndex(2);
		Thread.sleep(1000);
		
		sc.deSelectByContainsVisibleText("France");
			
		
	}

}
