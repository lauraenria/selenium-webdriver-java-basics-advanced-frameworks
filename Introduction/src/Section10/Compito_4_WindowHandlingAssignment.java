package Section10;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Compito_4_WindowHandlingAssignment {

    public static void main(String[] args) {

        // 1. Initialize the WebDriver instance for Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Create a WebDriverWait instance to manage explicit waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 3. Open the main website:
        // [https://the-internet.herokuapp.com/](https://the-internet.herokuapp.com/)
        driver.get("https://the-internet.herokuapp.com/");

        // 4. Maximize the browser window
        driver.manage().window().maximize();

        // 5. Locate the “Multiple Windows” link from the list of available examples

        By multipleWindowsLocator = By.linkText("Multiple Windows");
        WebElement multipleWindowsLink = wait.until(ExpectedConditions.elementToBeClickable(multipleWindowsLocator));

        // 6. Click the “Multiple Windows” link to open the window handling exercise
        // page
        multipleWindowsLink.click();

        // 7. Wait until the “Opening a new window” page is loaded

        // Multiple solutions:
        /*
         * By.tagName("h3");
         * By.cssSelector("h3");
         * By.cssSelector("div.example h3");
         * By.cssSelector("#content.example h3");
         * By.xpath("//h3[text()='Opening a new window']");
         * By.xpath("//h3[normalize-space()='Opening a new window']");
         * By.xpath("//div[@class'example']/h3");
         * By parentHeadingLocator = By.cssSelector("#content div.example h3");
         * By parentHeadingLocator = By.cssSelector("#content > div.example > h3");
         */

        By parentHeadingLocator = By.cssSelector("#content .example h3");

        wait.until(ExpectedConditions.visibilityOfElementLocated(parentHeadingLocator));

        // 8. Capture and store the current parent window handle using getWindowHandle()
        String parentWindow = driver.getWindowHandle();

        // 9. Print the parent window handle, if needed
        System.out.println("Parent window handle: " + parentWindow);

        // 10. Locate the “Click Here” link on the “Opening a new window” page
        By clickHereLocator = By.linkText("Click Here");

        WebElement clickHereLink = wait.until(ExpectedConditions.elementToBeClickable(clickHereLocator));

        // 11. Click the “Click Here” link to open a new browser window/tab
        clickHereLink.click();

        // 12. Wait until the total number of browser windows becomes 2
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // 13. Capture all opened window handles using getWindowHandles()
        Set<String> allWindows = driver.getWindowHandles();

        // 14. Print all captured window handles, if needed

        System.out.println("All window handles: " + allWindows);

        // 15. Loop through all window handles

        Iterator<String> iterator = allWindows.iterator();

        // 16. Identify the child window by checking which window handle is different
        // from the parent window handle
        String parentId = iterator.next();

        // 17. Store the child window handle in a separate variable
        String childId = iterator.next();

        // 18. Switch Selenium control from the parent window to the child window
        driver.switchTo().window(childId);

        // 19. Wait until the text in the child window is visible

        By childWindowHeading = By.cssSelector("div.example h3");

        wait.until(ExpectedConditions.visibilityOfElementLocated(childWindowHeading));

        // 20. Locate the text displayed in the child window
        WebElement childWindowElement = driver.findElement(childWindowHeading);

        // 21. Capture and print the text from the child window: “New Window”
        String childWindowText = childWindowElement.getText();

        System.out.println("childWindowText =" + childWindowText);

        // 22. Switch Selenium control back to the parent window using the parent window
        // handle
        driver.switchTo().window(parentId);

        // 23. Wait until the parent window content is visible again

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(parentHeadingLocator));

        // 24. Locate the heading text displayed in the parent window
        WebElement parentWindowHeading = driver.findElement(parentHeadingLocator);

        // 25. Capture and print the text from the parent window: “Opening a new window”
        String parentWindowText = parentWindowHeading.getText();

        // 26. Verify, if needed, that the child window text is “New Window”
        Assert.assertEquals(childWindowText, "New Window");

        // 27. Verify, if needed, that the parent window text is “Opening a new window”
        Assert.assertEquals(parentWindowText, "Opening a new window");

        // 28. Close all browser windows after the test execution using driver.quit()
        driver.quit();

    }
}
