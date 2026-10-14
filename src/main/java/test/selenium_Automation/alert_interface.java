package test.selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_interface {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//simple alert
		driver.findElement(By.id("alertBtn")).click();
		Alert al= driver.switchTo().alert();
		System.out.println("text of simple alert is:"+al.getText());
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(2000);
		
		
		//confirmation alert
		driver.findElement(By.id("confirmBtn")).click();
		Alert al1 = driver.switchTo().alert();
		System.out.println("text of simple alert is:"+al1.getText());
		Thread.sleep(2000);
		al1.dismiss();
		
		//prompt alert
		driver.findElement(By.id("promptBtn")).click();
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(2000);
		al2.accept();
	}

}
