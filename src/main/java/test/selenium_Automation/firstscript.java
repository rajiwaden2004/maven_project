package test.selenium_Automation;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
	public static void main(String args[]) throws InterruptedException
	{
		
		//1.set the properties of webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP ELITEBOOK\\NehaAutomationTesting\\selenium_Automation\\DriverResources\\chromedriver.exe");
		System.out.println("1.Webdriver configuration done!");
		
		//2.Create the object of chromedriver/intialize chromedriver    //Initialize the object
		ChromeDriver driver=new ChromeDriver();
		System.out.println("2.Initialize ChromeDriver"); 
		
		driver.get("https://www.cravitaindia.com/");
		Thread.sleep(1000);
		driver.close();
	}

}
