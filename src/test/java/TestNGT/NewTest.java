package TestNGT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		


public class NewTest {		
	    private WebDriver webdriver;		
		@Test				
		public void testEasy() {	
			webdriver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = webdriver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "D://Training_Doc//Automation//Drivers//chromedriver.exe");
			 webdriver=new ChromeDriver();
		}		
		@AfterTest
		public void afterTest() {
			webdriver.quit();			
		}		
}	
