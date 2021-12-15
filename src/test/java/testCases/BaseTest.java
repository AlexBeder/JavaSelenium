package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
  protected WebDriver driver;

  @BeforeMethod
  public void startUp() {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
    driver = new EdgeDriver();
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
  }
}
