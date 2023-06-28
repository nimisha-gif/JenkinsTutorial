package testcases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.ObsquraZoneSelenium.WebDriverManage;

public class initialpages {
	WebDriver driver;
	WebDriverManage objManage;
	public initialpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objManage = new WebDriverManage();
	}
	
	@FindBy(xpath = "//*[@id='collapsibleNavbar']/ul/li[2]/a")
	private WebElement inputform;
	
	@FindBy(id = "single-input-field")
	private WebElement enterMessage;
	
	@FindBy(id = "button-one")
	private WebElement button;
	
	@FindBy(id = "message-one")
	private WebElement yourMessage;
	
	@FindBy(id="value-a")
	private  WebElement enterValueA;
	
	@FindBy(id="value-b")
	private WebElement enterValueB;
	
	@FindBy(id="button-two")
	private WebElement getTotal;
	
	@FindBy(id="message-two")
	private WebElement totalSum;
	
	@FindBy(tagName="a")
	private List<WebElement>link;
	
	
	public void inpuformclick() {
		System.out.println(link.size());
		objManage.clickelement(inputform);
	}

	
	public void enterMessage(String hellovalue) throws Exception {
		//enterMessage.sendKeys("Hello");
		objManage.enterText(enterMessage, "Hello");

	}

	
	public void button() throws Exception {
		//button.click();
		objManage.clickelement(button);
		objManage.takeSnapShot(driver);
	
	}

	
	public String yourMessage() {
		String message = objManage.returnText(yourMessage);
		String[] r = message.split(":");
		return r[1].trim();
	}

	
	public void enterValueA() {
	objManage.enterText(enterValueA, "20");
	}
	
	
	public void enterValueB() {
		objManage.enterText(enterValueB, "30");
	}
	
	
	public void getTotal() throws Exception {
		objManage.clickelement(getTotal);
		objManage.takeSnapShot(driver);
	}
	
	
	public String totalSum() {
		String sum=objManage.returnText(totalSum);
		String s[]=sum.split(":");
		return s[1].trim();
	}

}
