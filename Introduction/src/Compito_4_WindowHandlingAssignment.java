import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Compito_4_WindowHandlingAssignment {

    public static void main(String[] args) {
      
    // 1. Initialize the WebDriver instance for Chrome
    WebDriver driver = new ChromeDriver();

    // 2. Create a WebDriverWait instance to manage explicit waits
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    // 3. Open the main website: [https://the-internet.herokuapp.com/](https://the-internet.herokuapp.com/)

    // 4. Maximize the browser window

    // 5. Locate the “Multiple Windows” link from the list of available examples

    // 6. Click the “Multiple Windows” link to open the window handling exercise page

    // 7. Wait until the “Opening a new window” page is loaded

    // 8. Capture and store the current parent window handle using getWindowHandle()

    // 9. Print the parent window handle, if needed

    // 10. Locate the “Click Here” link on the “Opening a new window” page

    // 11. Click the “Click Here” link to open a new browser window/tab

    // 12. Wait until the total number of browser windows becomes 2

    // 13. Capture all opened window handles using getWindowHandles()

    // 14. Print all captured window handles, if needed

    // 15. Loop through all window handles

    // 16. Identify the child window by checking which window handle is different from the parent window handle

    // 17. Store the child window handle in a separate variable

    // 18. Switch Selenium control from the parent window to the child window

    // 19. Wait until the text in the child window is visible

    // 20. Locate the text displayed in the child window

    // 21. Capture and print the text from the child window: “New Window”

    // 22. Switch Selenium control back to the parent window using the parent window handle

    // 23. Wait until the parent window content is visible again

    // 24. Locate the heading text displayed in the parent window

    // 25. Capture and print the text from the parent window: “Opening a new window”

    // 26. Verify, if needed, that the child window text is “New Window”

    // 27. Verify, if needed, that the parent window text is “Opening a new window”

    // 28. Close all browser windows after the test execution using driver.quit()

           }
}
