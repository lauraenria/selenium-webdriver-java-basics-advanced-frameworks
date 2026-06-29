import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

  public static void main(String[] args) {

    // Invoking Browser
    // Chrome - ChromeDriver exten->Methods close get
    // Firefox- FirefoxDriver ->methods close get
    // safari SaariDrier ->methods close get
    // WebDriver close get
    // WebDriver methods + class methods
    // Chromedriver.exe -> Chrome browser
    // step to invoke chrome driver //
    // Selenium Manager

    // D:\Time Machine2\MC Engineering\Selenium WebDriver with Java – Basics to
    // Advanced + Frameworks (Udemy) 2026\chromedriver-win64.exe
    // String pathChromeDriver = "D:\\Time Machine2\\MC Engineering\\Selenium
    // WebDriver with Java – Basics to Advanced + Frameworks (Udemy)
    // 2026\\chromedriver-win64.exe";
    // System.setProperty("webdriver.chrome.driver", pathChromeDriver);

    // Lesson 13
    WebDriver driver = new ChromeDriver(); // Fa tutto da solo!

    // Firefox
    // System.setProperty("webdriver.gecko.driver",
    // "/Users/rahulshetty/Documents/geckodriver");
    WebDriver driver1 = new FirefoxDriver();

    // Microsoft Edge
    // System.setProperty("webdriver.edge.driver",
    // "/Users/rahulshetty/Documents/msedgedriver");
    WebDriver driver2 = new EdgeDriver();

  }

}