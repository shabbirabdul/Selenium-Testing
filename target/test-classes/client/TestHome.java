package client;

import static org.junit.Assert.fail;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestHome {
	
	  @Test
	   public void testHomePage() throws Exception {
//		  URL local = new URL("http://127.0.0.1:9515");
//			WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
			// open the browser and go to home page of the application
//			driver.get("http://ec2-52-6-55-84.compute-1.amazonaws.com:8080/mywebapp/");
			// wait 5 seconds and close the browser
//			Thread.sleep(5000);
//			if(driver.getPageSource().length()!=1856)
//				fail("Incorrect version of Software deployed");
//			driver.quit();
	   }
	  
	  @Test
	  public void testHomeContent() throws Exception{
//		  URL local = new URL("http://127.0.0.1:9515");
//			WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
			// open the browser and go to home page of the application
//			driver.get("http://ec2-52-6-55-84.compute-1.amazonaws.com:8080/mywebapp/");
//			String text = "Spring is light weight java application development framework ";
//			if(driver.getPageSource().contains("Spring is light weight java application development framework"))
//				System.out.println("Correct version of software deployed");
//			else
//				fail("Incorrect version of Software deployed");
			
	  }
	  
}

