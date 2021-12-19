package testCases;

import enums.BrowserType;
import helper.BrowserSelector;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  protected WebDriver driver;

  @BeforeMethod
  public void startUp() {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    driver = BrowserSelector.getDriver(BrowserType.EDGE);
    driver.manage().window().maximize();
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
  }
}
