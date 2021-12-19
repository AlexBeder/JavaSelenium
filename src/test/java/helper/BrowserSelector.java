package helper;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserSelector {
  public static WebDriver getDriver(BrowserType type) {
    switch (type) {
      case EDGE:
        return getEdgeDriver();
      default:
        return getChromeDriver();
    }

  }

  private static WebDriver getChromeDriver() {
   // ChromeOptions options = new ChromeOptions();
   // options.addArguments("start-maximized");
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    return new ChromeDriver();
  }

  private static WebDriver getEdgeDriver() {
    System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
    return new EdgeDriver();

  }
}
