package test.selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ORANGEHRM {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		//forgot password
		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		
		//reset password
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//explicit wait 
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		
		//WebElement loginbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		//loginbtn.click();
		
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		
		WebElement resetbtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		resetbtn.click();
		
		
		
	}

}
