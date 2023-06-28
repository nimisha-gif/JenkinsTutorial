package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

public class DropDownPage {
	WebDriver driver;
	WebDriverManage objManage;
	public DropDownPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		objManage = new WebDriverManage();
	}
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[4]/a")
	private WebElement selectinput;
	
	@FindBy(id = "single-input-field")
	  private WebElement dropdown;
	
	@FindBy(id="multi-select-field")
	private WebElement multipledropdown;
	
	public void selectinputclick()
	{
	  objManage.clickelement(selectinput);
	}

	public void selectdropdown()
	{
		
		objManage.dropdown(dropdown, "Yellow");
	}

	public void selectmultipledropdown()
	{

		
		objManage.dropdown(multipledropdown, "Red");
		objManage.dropdown(multipledropdown, "Green");
	}
}
