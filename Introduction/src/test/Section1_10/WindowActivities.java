package test.Section1_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) {

        /*
         * System.setProperty("webdriver.chrome.driver",
         * "/Users/rahulshetty/Documents/chromedriver");
         */

        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open Google
        driver.get("http://google.com");

        // Navigate to another website
        driver.navigate().to("https://rahulshettyacademy.com");

        // Navigate back
        driver.navigate().back();

        // Navigate forward
        driver.navigate().forward();
    }
}
