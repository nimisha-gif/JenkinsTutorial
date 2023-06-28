package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

public class projectInitialPages {
	 WebDriver driver;
	 WebDriverManage objManage;
	 public projectInitialPages(WebDriver driver)
	 {
		    this.driver=driver;
			PageFactory.initElements(driver,this);
			objManage = new WebDriverManage();
	 }
	 @FindBy(id="username")
	 private WebElement username;
	 
	 @FindBy(id="password")
	 private WebElement password;
	 
	 @FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/form/div[4]/div/button")
	 private WebElement loginbtn;
	 
	 public void login(String id,String key)
	 {
		 username.sendKeys("admin");
		 password.sendKeys("123456");
		 loginbtn.click();
		 
	 }



}
