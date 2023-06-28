package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Alert extends WebDriverManage {
	WebDriver driver;
	String url ="https://selenium.obsqurazone.com/index.php";
	String browser ="Chrome";
  @Test(priority =0,enabled=true)
  public void alertMethod() throws InterruptedException {
			Alertpage objalert = new Alertpage(driver);
			objalert.alertlinkclick();
			  Thread.sleep(2000);
			 objalert.javascriptclick();
			  Thread.sleep(2000);
			 objalert.clickMe();
			  Thread.sleep(2000);
			
  }
  @Test(priority = 1,enabled=true)
  public void alertBox() throws InterruptedException
  {
	  
	  Alertpage objalert = new Alertpage(driver);
		objalert.clickPromptBoxBtn();
			  Thread.sleep(2000);
			  Assert.assertEquals("Nimisha",objalert.nameentered());
			  System.out.println("EQUAL");
			  
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
