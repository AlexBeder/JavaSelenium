package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoQaLoginTest {

  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeMethod
  public void startUp() {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
    driver = new EdgeDriver();
    wait = new WebDriverWait(driver,10, 100);
    driver.get("https://demoqa.com/login");
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
  }

  @Test
  public void loginToApp() {
    WebElement userName = driver.findElement(By.cssSelector("[id='userName']"));
    WebElement password = driver.findElement(By.cssSelector("[id='password']"));
    WebElement loginButton = driver.findElement(By.cssSelector("[id='login']"));

    userName.sendKeys("AlexTester");
    password.sendKeys("AlexPass1234$");
    loginButton.click();

    try {
      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='userName-value']")));
      WebElement enteredUser = driver.findElement(By.cssSelector("[id='userName-value']"));
      Assert.assertEquals(enteredUser.getText(), "AlexTester");
    } catch (NoSuchElementException xx) {
      Assert.fail("userName element not found");
    }

  }

}
