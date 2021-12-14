package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {
  private WebDriver driver;
  private WebDriverWait wait;

  public ProfilePage(WebDriver driver) {
    this.driver=driver;
    wait = new WebDriverWait(this.driver, 10, 200);
  }

  public boolean isProfilePage(){
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='userName-value']")));
      return true;

    } catch (Exception xx) {
      return false;
    }
  }
}
