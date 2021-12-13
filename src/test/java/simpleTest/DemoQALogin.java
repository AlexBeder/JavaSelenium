package simpleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoQALogin {

  @Test
  public void loginToApp(){
    // Name = Alex Tester, User = AlexTester, Password = AlexPass1234$
    // [id='userName']
    // [id='password']
    // [id='login']
    // [id='userName-value']

    System.setProperty("webdriver.edge.driver","msedgedriver.exe");
    WebDriver driver = new EdgeDriver();

    driver.get("https://demoqa.com/login");
    driver.findElement().b


    driver.close();
  }

}
