package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

public class Alertpage {
	WebDriver driver;
	WebDriverManage objManage;
	public Alertpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objManage = new WebDriverManage();
	}
	
	@FindBy(xpath="//*[@id=\"alert-modal\"]")
	  private WebElement alertlink;
	
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[5]/a")
	 private WebElement javaScript;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[1]/div/div[2]/button")
	private WebElement clickMe;
	
	 @FindBy(xpath="/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")
	  private WebElement clickPromptBoxBtn;
	 
	 @FindBy(id="prompt-demo")
	  private WebElement nameentered;
	
	public void alertlinkclick()
	{
	objManage.clickelement(alertlink);	
	}
	
	public void javascriptclick()
	{
	  objManage.clickelement(javaScript);
	}
	
	  public void clickMe() throws InterruptedException
	  {
		  objManage.clickelement(clickMe);
		  Thread.sleep(2000);
		  objManage.alert(driver,"accept","");
		
	  }
	 
	  public void clickPromptBoxBtn() throws InterruptedException
	  {
	  objManage.clickelement(clickPromptBoxBtn);
	  Thread.sleep(2000);
		 objManage.alert(driver,"inputText","Nimisha");
		 Thread.sleep(2000);
	  }
	 
	  public String nameentered()
	  {
	  String alerttext =objManage.returnText(nameentered);
	  String value[] = alerttext.split(" ");
	  return value[3].replace("'", " ").trim();
	  }
}
