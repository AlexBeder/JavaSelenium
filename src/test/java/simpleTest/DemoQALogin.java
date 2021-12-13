package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoQALogin {

  @Test
  public void loginToApp() throws InterruptedException {
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$

    System.setProperty("webdriver.edge.driver","msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.get("https://demoqa.com/login");

    WebElement userName = driver.findElement(By.cssSelector("[id='userName']"));
    WebElement password = driver.findElement(By.cssSelector("[id='password']"));
    WebElement loginButton = driver.findElement(By.cssSelector("[id='login']"));

    userName.sendKeys("AlexTester");
    password.sendKeys("AlexPass1234$");
    loginButton.click();
    Thread.sleep(2000);

    try{
      WebElement enteredUser = driver.findElement(By.cssSelector("[id='userName-value']"));
      Assert.assertTrue(true);
    } catch (NoSuchElementException xx) {
      Assert.fail("userName element not found");
    }


    Thread.sleep(3000);
    driver.close();
  }

}
