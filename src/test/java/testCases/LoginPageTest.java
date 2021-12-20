package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest extends BaseTest {


  @Test(description = "Positive login test", enabled = true)
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

  @Test(description = "Positive login test", enabled = false)
  public void loginToApp2() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login("AlexTester", "AlexPass1234$");
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp2() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login("AlexTester_Wrong", "AlexPass1234$");
    Assert.assertTrue(loginPage.isError());
  }

}
