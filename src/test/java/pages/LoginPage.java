package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
  private WebDriver driver;
  private WebDriverWait wait;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(this.driver, 10, 200);
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
    getUserNameField().sendKeys(userName);
    getPasswordField().sendKeys(password);
    getLoginButton().click();
    return new ProfilePage(driver);
  }

  public boolean isError() {
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='name']")));
      return true;

    } catch (Exception xx) {
      return false;
    }
  }
}
