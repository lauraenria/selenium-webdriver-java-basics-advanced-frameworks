package test.Section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        int allLinks = driver.findElements(By.tagName("a")).size();

        // 1. Count all links on the page
        System.out.println("Total number of links on the page: " + allLinks);

        // 2. Limit WebDriver scope to footer
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        // Count links in the footer
        int footerLinks = footerdriver.findElements(By.tagName("a")).size();

        System.out.println("Links in the footer: " + footerLinks);

        // 3. Limit scope to first column of footer
        WebElement firstColumnDriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']//tr//td[1]/ul"));

        // Count links in the first column of the footer
        int firstColumnDriverLinksCount = firstColumnDriver.findElements(By.tagName("a")).size();

        System.out.println("Links in the first column of the footer: " + firstColumnDriverLinksCount);

        // 4. Click each link in the column and check if the pages are opening

        for (int i = 1; i < firstColumnDriverLinksCount; i++) {

            // Open link in a new tab using Ctrl + Enter
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            firstColumnDriver
                    .findElements(By.tagName("a"))
                    .get(i)
                    .sendKeys(clickOnLinkTab);

            // try {
            // Thread.sleep(0000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }

        }

        Set<String> allWindows = driver.getWindowHandles();

        Iterator<String> iteratorWindows = allWindows.iterator();

        while (iteratorWindows.hasNext()) {

            String windowID = iteratorWindows.next();

            driver.switchTo().window(windowID);

            System.out.println(driver.getTitle());

        }

        driver.quit();
    }
}
