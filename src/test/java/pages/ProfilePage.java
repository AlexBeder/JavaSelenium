package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage {

  public ProfilePage(WebDriver driver) {
    super(driver);

  }

  public boolean isProfilePage(){
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='userName-value']")));
      return true;

    } catch (TimeoutException xx) {
      return false;
    }
  }
}
