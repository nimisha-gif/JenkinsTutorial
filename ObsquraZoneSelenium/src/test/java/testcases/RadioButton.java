package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class RadioButton extends WebDriverManage {
	WebDriver driver;
	String url ="https://selenium.obsqurazone.com/index.php";
	String browser ="Chrome";
  @Test
  public void radioButton() throws InterruptedException {
	  initialpages objpages = new initialpages(driver);
	  objpages.inpuformclick();
	  Thread.sleep(2000);
	  radiopage obj = new radiopage(driver);
	  obj.radiobuttondemoclick();
	  Thread.sleep(2000);
	 obj.maleradiobuttonclick();
	  Thread.sleep(2000);
	  obj.showselectedvaluebuttonclick();
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
