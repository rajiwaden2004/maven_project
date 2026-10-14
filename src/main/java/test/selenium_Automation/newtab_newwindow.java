package test.selenium_Automation;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newtab_newwindow {
	
	public static void main(String[]args) throws InterruptedException {
		
		 FirefoxDriver  driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 //open the window
		 driver.get("https://www.fortunecloudindia.com/");
		 System.out.println("Title of fct:"+driver.getTitle());
		 Thread.sleep(1000);
		 
		 //new tab
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 //OPEN THE NEW TAB
		 driver.navigate().to("https://www.cravitaindia.com/");
		 System.out.println("Title of cravita:"+driver.getTitle());
		 
		 //new window
		 EdgeDriver edriver =new EdgeDriver();
		 edriver.get("https://github.com/");
		 System.out.println("Title of GitHub:"+driver.getTitle());
		 edriver.switchTo().newWindow(WindowType.WINDOW);
		 
		 //naviagte to another page
		 edriver.navigate().to("https://www.programiz.com/");
		 System.out.println("current url of online compiler:"+edriver.getCurrentUrl());
		 
		 driver.quit(); //all FIRFOX BROWSER WINDOW WILL BE CLOSED
		 edriver.quit(); //all edge browser window will be closed
	}

}
