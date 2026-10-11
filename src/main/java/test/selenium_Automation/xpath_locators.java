package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_locators {
	public static void main(String args[]) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/register");
		
		//1.xpath://tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("patil");
		
		//2.xpath://parenttagName/childtagname
		//driver.findElement(By.xpath("//div/input")).sendKeys("ram@1223");
		
		//3.xpath://tagname[@attribute='value' and @attribute='value'
		driver.findElement(By.xpath("//input[@type='text' and @id='userName']")).sendKeys("ramp12340");
		
		//passsword
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ram@123");
		
		//register
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	

		 
		
		
	}

}
