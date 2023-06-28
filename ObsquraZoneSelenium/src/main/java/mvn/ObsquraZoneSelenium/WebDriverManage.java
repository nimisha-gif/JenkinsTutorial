package mvn.ObsquraZoneSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverManage{
public WebDriver driver;
	
public void browserLaunch(String browser, String url) {
		
		if(browser.equals("Chrome")) {
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
			}
		else if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
		}
		}
		
		public void clickelement(WebElement element) {
			element.click();
		}
		
		public void enterText(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		public String  returnText(WebElement element) {
			return element.getText();
		}
		public void dropdown(WebElement element,String value) {
			 Select obj = new Select(element);
			 obj.selectByValue(value);
			
		}
		
	
		
		public void alert(WebDriver driver,String action, String inputText) throws InterruptedException {
			Alert alert=driver.switchTo().alert();
			switch(action) 
			{
			case "accept":
				alert.accept();
				break;
			case "dismiss":
				alert.dismiss();
				break;
			case "inputText":
				alert.sendKeys(inputText);
				Thread.sleep(2000);
				alert.accept();
				break;
			}
		}
			
		
		
		
		public  void takeSnapShot(WebDriver webdriver) throws Exception{
			
			Date d = new Date();
			String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

	    	//Convert web driver object to TakeScreenshot
	    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	    	//Call getScreenshotAs method to create image file
	    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	    	//Move image file to new destination
	    	File DestFile = new File("C:\\Users\\Nimisha\\Documents\\Selenium\\ObsquraZoneSelenium\\src\\main\\resources\\test "+ FileName );
	    	//Copy file at destination
	    	Files.copy(SrcFile, DestFile);
	    	}
		public void explicitWait()
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());
			
		}
		
		public void uploadFileWithRobot(String imagePath)throws InterruptedException
		{
			StringSelection stringSelection = new StringSelection(imagePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	        Robot robot = null;
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	        robot.delay(250);
	        Thread.sleep(3000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(3000);
	        robot.delay(150);
	        robot.keyRelease(KeyEvent.VK_ENTER);
		}
	

}


