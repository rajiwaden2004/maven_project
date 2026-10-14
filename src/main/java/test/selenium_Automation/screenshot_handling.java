package test.selenium_Automation;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot_handling {
	public static void main(String[]args) throws IOException {
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		File src = (File)driver.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File("C:\\Users\\HP ELITEBOOK\\NehaAutomationTesting\\selenium_Automation\\Scrrenshot\\fiplcart.png");
		
		Files.copy(src, Dest);
		
		driver.close();
		
		
	}

}
