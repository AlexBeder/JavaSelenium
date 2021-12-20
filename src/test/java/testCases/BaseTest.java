package testCases;

import enums.BrowserType;
import helper.BrowserSelector;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {
  protected WebDriver driver;
  protected String userName;
  protected String password;
  protected String wrongUserName;

 // @Parameters({"userName", "password", "wrongusername"})
  @BeforeMethod
  public void startUp () {//(String user, String pswd, String wrongUser) {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    userName = "AlexTester";
    password = "AlexPass1234$";
    wrongUserName = "wrongUser";
    driver = BrowserSelector.getDriver(BrowserType.EDGE);
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
   // Thread.sleep(3000);
    driver.close();
  }
}
