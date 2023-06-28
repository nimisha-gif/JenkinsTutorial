package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DropDown extends WebDriverManage {
	String url ="https://selenium.obsqurazone.com/index.php";
	String browser ="Chrome";
  @Test(priority=0,enabled =true)
  public void DropDownSelectColor() throws InterruptedException {
	  initialpages objpages =new initialpages(driver);
	  objpages.inpuformclick();
	  Thread.sleep(2000);
	DropDownPage objdropdown =new DropDownPage(driver);
	objdropdown.selectinputclick();
	  Thread.sleep(2000);
	
	 objdropdown.selectdropdown();
	 Thread.sleep(2000);
	 
}
  @Test(priority=1,enabled=true)
public void MultipleDropDown() throws InterruptedException
{
	  DropDownPage objdropdown =new DropDownPage(driver);
	  objdropdown.selectmultipledropdown();
	 Thread.sleep(2000);
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
