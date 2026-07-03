package test.Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://jqueryui.com/droppable/");

        driver.manage().window().maximize();

        // Switch to the first frame by index
        // driver.switchTo().frame(1);

        // Counts the number of iframes present
        System.out.println("iframe count: " + driver.findElements(By.tagName("iframe")).size());

        // Switch to the frame by element
        // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

        // driver.findElement(By.id("draggable")).click();

        // Enter the frame
        driver.switchTo().frame(
                driver.findElement(
                        By.cssSelector("iframe.demo-frame")));

        Actions a = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droppable"));

        a.dragAndDrop(source, target)
                .build()
                .perform();

        // Back to the home page
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
