package test.selenium_Automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//left slider
		WebElement leftslider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(leftslider, 80, 0).build().perform();
		
		//right slider
		//WebElement rightslider=driver.findElement(By.xpath("//span[@style=left: 64%;']"));
		
		//Actions a1 = new Actions(driver);
		// a1.dragAndDropBy(rightslider, -30, 0).build().perform();
		
		
		
		
		
		
		
		
	}

}
