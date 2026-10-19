package test.selenium_Automation;

import java.util.ArrayList;
import java.util.Collections;
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
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
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
		
		//Assign or manage the color
		//retrieve the options from a dropdown
		WebElement colorElement = driver.findElement(By.id("colors"));
		Select color = new Select(colorElement);
		for(WebElement option : color.getOptions()) {
			System.out.println(option.getText());
			color.selectByIndex(3);
			//System.out.println("Selected: " + color.getFirstSelectedOption().getText());		    
		}
		
		//sorted list
		WebElement listElement = driver.findElement(By.id("animals"));
		Select sortedList = new Select(listElement);
		List<String> actualList = new ArrayList<>();
		
		for(WebElement option :sortedList.getOptions()) {
			actualList.add(option.getText().trim());		
		}
	    
		//create a separate copy
		List<String> expectedList = new ArrayList<>(actualList);
		
		//sort the list in alphabetically
		Collections.sort(expectedList,String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Actual list :"+actualList);
		System.out.println("Expected list :"+expectedList);
		
		if(actualList. equals(expectedList)) {
			System.out.println("Pass: Sortedlist in alphabetic order");
		}
		else {
			System.out.println("Fail: Sortedlist is not in alphabetic order");
		}
		
		//daypicker1
		driver.findElement(By.id("datepicker")).sendKeys("01/12/2004");
		
		//datepicker2
		// Date Picker 2
		//WebElement date2 = driver.findElement(By.id("txtDate"));
		//date2.click();
		
		//selecting the one file
		driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("C:\\Users\\HP ELITEBOOK\\OneDrive\\Pictures\\Screenshots");
		
		//uploading multiple file
		driver.findElement(By.id("multipleFilesInput")).sendKeys("C:\\Users\\HP ELITEBOOK\\OneDrive\\Pictures\\Screenshots" + "\n" + "C:\\Users\\HP ELITEBOOK\\OneDrive\\Pictures\\Screenshots" + "\n" + "C:\\Users\\HP ELITEBOOK\\OneDrive\\Pictures\\Screenshots");
		
		//handlinh the checkbox for 1,2,3,4
		for(int page=0 ;page<=3; page++) {
			driver.findElement(By.linkText(String.valueOf(page))).click();
			Thread.sleep(1000);
			

		}
		
		
	}	
		
	}

