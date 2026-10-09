package test.selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicdriver_methods {
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\HP ELITEBOOK\\NehaAutomationTesting\\selenium_Automation\\DriverResources\\chromedriver.exe");
		//Initialize chromeDriver
		ChromeDriver driver =new ChromeDriver();
		
		//maximize driver
		driver.manage().window().maximize();
		
		//launch sppu
		driver.get("https://unipune.ac.in/?pp.aspx");
		Thread.sleep(1000);
		
		//navigate webapp
		driver.get("https://www.fortunecloudindia.com/");
		Thread.sleep(1000);
		
		//navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh page
		driver.navigate().refresh();
		
	}
 
}
