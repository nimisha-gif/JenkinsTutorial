package testcases;

import org.testng.annotations.Test;
import mvn.ObsquraZoneSelenium.WebDriverManage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class InitialTestCase extends WebDriverManage {
  WebDriver driver;
  String url ="https://selenium.obsqurazone.com/index.php";
	String browser ="Chrome";
  @Test(priority = 0, enabled = true,dataProvider ="data-provider")
  public void enterMessage(String hellovalue,String place) throws Exception {
	  initialpages objpages = new initialpages(driver);
	  objpages.inpuformclick();
	  Thread.sleep(2000);
	  objpages.enterMessage(hellovalue);
		Thread.sleep(2000);
	  objpages.button();
		Thread.sleep(2000);
   Assert.assertEquals(hellovalue, objpages.yourMessage());
		
  }
  @DataProvider(name = "data-provider")
  public Object[][] dpMethod()
  {
	  return new Object[][] {{"Hello1","Ernakulam"},{"Hello2","Trivandrum"}};
  }
  @Test(priority=1,enabled=true)
  public void getTotal() throws Exception
  {
	  initialpages objpages = new initialpages(driver);
	objpages.enterValueA();
	Thread.sleep(2000);
	objpages.enterValueB();
	Thread.sleep(2000);
	objpages.getTotal();
	Thread.sleep(2000);
	Assert.assertEquals("50",objpages.totalSum());
  }
 @Parameters({"Browser"})
  @BeforeTest
  public void beforeTest(String Browser) {
browserLaunch(browser,url);
this.driver = super.driver;
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
	 }
}
