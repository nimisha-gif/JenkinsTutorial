package testcases;

import org.testng.annotations.Test;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Frames extends WebDriverManage{
	WebDriver driver;
	String url ="https://www.w3schools.com/html/html_iframe.asp";
	String browser ="Chrome";

  @Test
  public void frame() throws InterruptedException {

      WebElement iframe = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
      driver.switchTo().frame(iframe);
	  WebElement css = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[4]"));
	  css.click();
	  Thread.sleep(5000);
	  driver.switchTo().defaultContent();
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