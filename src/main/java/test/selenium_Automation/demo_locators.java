package test.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_locators {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//open the website
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//enter the first name
		driver.findElement(By.cssSelector("input[type='text'][placeholder='First Name']")).sendKeys("Neha");
		
		//enter the last name
		driver.findElement(By.cssSelector("input[placeholder='Last Name'][class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']")).sendKeys("Rajiwade");
		
		//enter the address
		driver.findElement(By.cssSelector("textarea#form-control ng-pristine ng-valid ng-touched")).sendKeys("pune");
		
		//enter the email
		driver.findElement(By.cssSelector("input.form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched")).sendKeys("r@gmail.com");
		
		
		//phone
		driver.findElement(By.cssSelector("input[type*='tel]'")).sendKeys("7558473001");
		
		
		//gender
		driver.findElement(By.cssSelector("input[type='radio'][value='FeMale']")).click();
		
		//hobbies ,Asscessing checkbox
		Select sel1 = new Select(driver.findElement(By.cssSelector("input[id='checkbox1']")));
		sel1.selectByVisibleText("Cricket");
				
		
		//language
		driver.findElement(By.cssSelector("#msdd")).sendKeys("english");
		
		//select skills
		Select sel = new Select(driver.findElement(By.id("Skills")));
		sel.selectByIndex(3);
		
		//select country
		driver.findElement(By.cssSelector("span[class*='select2-selection select2-selection--single']")).click();
		Select s =new Select(driver.findElement(By.cssSelector("select[id='country']")));
		s.selectByIndex(3);
		
		//accessing DOB
		Select dobyear = new Select(driver.findElement(By.cssSelector("select[id='yearbox']")));
		dobyear.selectByVisibleText("2004");
		
		Select dobMonth = new Select(driver.findElement(By.cssSelector("select[placeholder='Month']")));
		dobMonth.selectByVisibleText("january");
		
		Select dobday = new Select(driver.findElement(By.cssSelector("select[id='daybox']")));
		dobday.selectByVisibleText("12");
		
		
		// asscessing password field
		driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys("Neha@123");
		
		//accessing the confirmPassword field
		driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("Neha@123");
		
		//seelct the  photo file
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\HP ELITEBOOK\\OneDrive\\Pictures\\Screenshots");
		
		//accessing submit button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='submitbtn']")).click();
		
		//accessing refresh button
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='Button1']")).click();
	}

}
