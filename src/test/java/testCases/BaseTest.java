package testCases;

import enums.BrowserType;
import helper.BrowserSelector;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
  protected WebDriver driver;
  protected String userName;
  protected String password;

  @BeforeSuite
  public void credentials(){
    userName = "AlexTester";
    password = "AlexPass1234$";
  }


  @BeforeMethod
  public void startUp() {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    driver = BrowserSelector.getDriver(BrowserType.EDGE);
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
   // Thread.sleep(3000);
    driver.close();
  }
}
