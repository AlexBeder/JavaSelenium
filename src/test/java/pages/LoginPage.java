package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
  private static Logger logger = LogManager.getLogger(LoginPage.class);

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void openLoginPage(){
    driver.get("https://demoqa.com/login");
  }

  private WebElement getUserNameField(){
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='userName']")));
    return driver.findElement(By.cssSelector("[id='userName']"));
  }

  private WebElement getPasswordField(){
    return driver.findElement(By.cssSelector("[id='password']"));
  }

  private WebElement getLoginButton(){
    return driver.findElement(By.cssSelector("[id='login']"));
  }
  public ProfilePage login(String userName, String password) {
    logger.info("In the login method");
    getUserNameField().sendKeys(userName);
    getPasswordField().sendKeys(password);
    getLoginButton().click();
    logger.info("Login button is clicked");
    return new ProfilePage(driver);
  }

  public boolean isError() {
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='name']")));
      return true;

    } catch (TimeoutException xx) {
      return false;
    }
  }
}
