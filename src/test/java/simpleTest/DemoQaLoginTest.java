package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQaLoginTest {

  private WebDriver driver;

  @BeforeMethod
  public void startUp() {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
    driver = new EdgeDriver();
    driver.get("https://demoqa.com/login");
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
  }

  @Test
  public void loginToApp() throws InterruptedException {
    WebElement userName = driver.findElement(By.cssSelector("[id='userName']"));
    WebElement password = driver.findElement(By.cssSelector("[id='password']"));
    WebElement loginButton = driver.findElement(By.cssSelector("[id='login']"));

    userName.sendKeys("AlexTester");
    password.sendKeys("AlexPass1234$");
    loginButton.click();
    Thread.sleep(2000);

    try {
      WebElement enteredUser = driver.findElement(By.cssSelector("[id='userName-value']"));
      Assert.assertEquals(enteredUser.getText(), "AlexTester");
    } catch (NoSuchElementException xx) {
      Assert.fail("userName element not found");
    }

  }

}
