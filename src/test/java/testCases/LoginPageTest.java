package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest {
  private WebDriver driver;

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

  @Test(description = "Positive login test")
  public void loginToApp() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login("AlexTester", "AlexPass1234$");
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login("AlexTester_Wrong", "AlexPass1234$");
    Assert.assertTrue(loginPage.isError());
  }


}
