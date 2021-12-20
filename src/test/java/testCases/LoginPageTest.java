package testCases;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginPageTest extends BaseTest {

  //Retry practicing
  int count = 0;

  @Test(retryAnalyzer = RetryAnalyzer.class)
  public void retryTest(){
    if(count++<3){
      Assert.assertTrue(false);
    }
    Assert.assertTrue(true);
  }

  @Test(description = "Positive login test")
  public void loginToApp() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login(wrongUserName, password);
    Assert.assertTrue(loginPage.isError());
  }

  @Test(description = "Positive login test", enabled = false)
  public void loginToApp2() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    ProfilePage profilePage = loginPage.login(userName, password);
    Assert.assertTrue(profilePage.isProfilePage());
  }

  @Test(description = "Negative login test")
  public void wrongLoginToApp2() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.openLoginPage();
    loginPage.login(wrongUserName, password);
    Assert.assertTrue(loginPage.isError());
  }

}
