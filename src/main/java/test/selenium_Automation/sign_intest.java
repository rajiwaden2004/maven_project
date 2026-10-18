package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//without using static
//public class sign_intest {
	//declare the reference variable of ChromeDriver
	// ChromeDriver driver;
	//public static void main(String args[]) {
		//sign_intest obj=new sign_intest();
		//obj.launch();
		//obj.entercredentials();
		//obj.pressbutton();
		
	//}
	 //void launch() {
		//driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://demo.automationtesting.in/SignIn.html");
	//}
	//void entercredentials() {
		//driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("neha@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("neha@123");
		
	//}
    
	//void pressbutton() {
		//driver.findElement(By.id("enterbtn")).click();
	//}
//}

//using static
public class sign_intest {
	//declare the reference variable of ChromeDriver
	static ChromeDriver driver;
	public static void main(String args[]) {
		
		launch();
		entercredentials();
		pressbutton();	
	}
	 static void launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/SignIn.html");
	}
	static void entercredentials() {
	driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("neha@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("neha@123");
		
	}
    
	static void pressbutton() {
		driver.findElement(By.id("enterbtn")).click();
	}
}

