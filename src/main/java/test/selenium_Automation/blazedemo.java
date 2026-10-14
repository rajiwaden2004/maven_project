package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blazedemo {
	
	public static void main(String args[]) throws InterruptedException {
		
		//intialize the chrome
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://blazedemo.com/");
		
		//Dropdown for choosing the departure city
		Select depcity = new Select(driver.findElement(By.xpath("//select[@class='form-inline']")));
		depcity.selectByIndex(5);
		
		//Dropdown for choosing the destination
		Select descity = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		descity.selectByIndex(3);
		Thread.sleep(1000);
		
		//click on button findFlight
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		
		//choose this flight
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(1000);
		
		// assign the first name
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Neha");
		
		//address
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Fc road pune");
		
		//assighn city
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		
		//assign state
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
		
		//assighn pincose
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("411022");
		
		//cardType
		Select cardtype = new Select(driver.findElement(By.id("cardType")));
		cardtype.deselectByIndex(0);
		
		//assesign the credit card number
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("41102246789");
		
		//assighn month
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
		
		//assighn year
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2017");
		
		// assign name of the card
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("John Smith");
		
	

}
}
