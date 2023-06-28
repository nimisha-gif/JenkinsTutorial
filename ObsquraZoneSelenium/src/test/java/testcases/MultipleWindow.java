package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class MultipleWindow extends WebDriverManage{
	WebDriver driver;
	String url ="https://demo.guru99.com/popup.php";
	String browser ="Chrome";
  @Test
  public void multipleWindow() throws InterruptedException {
	  WebElement clickHere = driver.findElement(By.xpath("/html/body/p/a"));
	  clickHere.click();
	  Thread.sleep(2000);  
	  String MainWindow=driver.getWindowHandle();		
		
      // To handle all new opened window.				
          Set<String> s1=driver.getWindowHandles();		
      Iterator<String> i1=s1.iterator();		
      		
      while(i1.hasNext())			
      {		
          String ChildWindow=i1.next();		
          		
          if(!MainWindow.equalsIgnoreCase(ChildWindow))			
          {    		
               
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);	                                                                                                           
                  driver.findElement(By.name("emailid"))
                  .sendKeys("gaurav.3n@gmail.com");    
                  Thread.sleep(2000);  
                  
                  driver.findElement(By.name("btnLogin")).click();			
                  Thread.sleep(2000);  
                               
			// Closing the Child Window.
                      driver.close();		
          }		
          Thread.sleep(2000);  
      }		
      // Switching to Parent window i.e Main Window.
          driver.switchTo().window(MainWindow);				
  }
	  
  @BeforeTest
  public void beforeTest() {
	  browserLaunch(browser,url);
	  this.driver = super.driver;
  }

  @AfterTest
  public void afterTest() {
	driver.close();
  }

}
