package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest3 extends BaseTest {


  @Test(description = "Positive login test")
  public void loginToApp5() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp5() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login(wrongUserName, password);
    Assert.assertTrue(loginPage.isError());
  }

  @Test(description = "Positive login test")
  public void loginToApp6() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp6() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login(wrongUserName, password);
    Assert.assertTrue(loginPage.isError());
  }

}
