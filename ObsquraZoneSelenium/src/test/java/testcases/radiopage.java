package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.openqa.selenium.support.FindBy;

public class radiopage {
	WebDriver driver;
	WebDriverManage objManage;
	public radiopage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objManage = new WebDriverManage();
	}
	@FindBy(xpath ="/html/body/section/div/div/div[1]/div/div/ul/li[3]/a")
	private WebElement radiobuttondemo;
	
	@FindBy(id ="inlineRadio1")
	private WebElement maleradiobutton;
	
	@FindBy(id ="button-one")
	private WebElement showselectedvaluebutton;
	
	public void radiobuttondemoclick()
	{
	
		objManage.clickelement(radiobuttondemo);
	}
	
	public void maleradiobuttonclick()
	{
		
		objManage.clickelement(maleradiobutton);
		 boolean radiobtnvalue=maleradiobutton.isSelected();
		 if(radiobtnvalue==false)
		  {
				objManage.clickelement(maleradiobutton);
		  }
	}
	
	public void showselectedvaluebuttonclick()
	{
		objManage.clickelement(showselectedvaluebutton);
	}
	 
	  

}
