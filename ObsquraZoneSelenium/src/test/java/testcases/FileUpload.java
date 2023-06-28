package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class FileUpload extends WebDriverManage {
	WebDriver driver;
	String url ="https://blueimp.github.io/jQuery-File-Upload/";
	String browser = "Chrome";
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
	  uploadFileWithRobot("\"D:\\Testing\\Selenium\\FileUpload.txt\"");
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