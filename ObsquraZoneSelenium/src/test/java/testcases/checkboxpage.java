package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

public class checkboxpage {
	WebDriver driver;
	WebDriverManage objManage;
	
	public checkboxpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objManage = new WebDriverManage();
	}
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[2]/a")
	private WebElement checkboxdemo;
	
	@FindBy(id="gridCheck")
	private WebElement clickCheckBox;
	
	public void checkboxdemoclick()
	{
		objManage.clickelement(checkboxdemo);
	}
	
	public void clickCheckBox()
	{
	  objManage.clickelement(clickCheckBox);
	  boolean c= clickCheckBox.isSelected();
		if (c==false)
		{
			 objManage.clickelement(clickCheckBox);
			
		}
	}
}
