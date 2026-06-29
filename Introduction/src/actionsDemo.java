import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.amazon.com/");

        By accountMenu = By.id("nav-link-accountList");
        By searchBox = By.id("twotabsearchtextbox");

        WebElement move = wait.until(
                ExpectedConditions.visibilityOfElementLocated(accountMenu)
        );

        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBox)
        );

        Actions a = new Actions(driver);

        // Composite action: move to search box, click, hold SHIFT, type hello, double click
        a.moveToElement(search)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .doubleClick()
                .build()
                .perform();

        // Move to Account & Lists and right click
        a.moveToElement(move)
                .contextClick()
                .build()
                .perform();

        driver.quit();
    }
}