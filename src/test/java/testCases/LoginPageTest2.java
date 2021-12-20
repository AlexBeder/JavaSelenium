package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest2 extends BaseTest {


  @Test(description = "Positive login test")
  public void loginToApp3() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp3() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login("AlexTester_Wrong", password);
    Assert.assertTrue(loginPage.isError());
  }

  @Test(description = "Positive login test")
  public void loginToApp4() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp4() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login("AlexTester_Wrong", password);
    Assert.assertTrue(loginPage.isError());
  }

}
