import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Selenium imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Compito_3 {

    public static void main(String[] args) {

        // 1. Create Chrome preferences to disable Chrome Password Manager pop-ups
        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        // 2. Create ChromeOptions and apply the preferences
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // 3. Disable Chrome password leak detection feature
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-features=PasswordLeakDetection");

        // 4. Initialize the WebDriver instance for Chrome using ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // --- RIGA DI INIZIO TEST ---
        System.out.println("========================================");
        System.out.println("STARTING TEST: Checkbox Functionality");
        System.out.println("========================================");

        // 5. Configure explicit wait and browser settings
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 6. Navigate to the login page
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // 7. Locate the username field and enter the username
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        // 8. Locate the password field and enter the password
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");

        // 9. Select the "User" radio button
        driver.findElement(By.cssSelector("input[value='user']")).click();
        // 10. Wait until the confirmation pop-up appears and click the "Okay" button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn"))).click();

        // 11. Locate the dropdown menu
        WebElement roleDropdown = driver.findElement(By.cssSelector("select.form-control"));

        // 12. Create a Select object for the dropdown
        Select dropdown = new Select(roleDropdown);

        // 13. Select the "Consultant" option from the dropdown
        dropdown.selectByContainsVisibleText("Consultant");

        // 14. Click the terms and conditions checkbox
        driver.findElement(By.id("terms")).click();

        // 15. Click the "Sign In" button
        driver.findElement(By.id("signInBtn")).click();

        // 16. Wait until the shop page is loaded
        wait.until(ExpectedConditions.urlContains("shop"));

        // 17. Wait until the product cards are visible on the page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card")));

        // 18. Locate all the "Add" buttons available on the shop page
        List<WebElement> addButton = driver.findElements(By.cssSelector(".card-footer button"));

        // 19. Store the total number of products found on the page
        int totalProducts = addButton.size();

        // 20. Verify that products are available before adding them to the cart
        Assert.assertTrue(totalProducts > 0, "No products were found on the shop page!");

        // 21. Loop through all the "Add" buttons
        for (int i = 0; i < totalProducts; i++) {

            // 22. Click each "Add" button to add every product to the cart
            addButton.get(i).click();
        }

        System.out.println("Total products added to cart: " + totalProducts);

        // 23. Wait until the Checkout button is clickable
        String checkoutButton = "a.nav-link.btn.btn-primary";

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(checkoutButton)));

        // 24. Click the Checkout button
        driver.findElement(By.cssSelector(checkoutButton)).click();

        // 25. Wait until the checkout/cart page is loaded
        //wait.until(ExpectedConditions.urlContains("shop"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody tr")));

        // 26. Verify that the checkout page contains the selected products
        List<WebElement> productInCart = driver.findElements(By.cssSelector("tr"));
        Assert.assertTrue(productInCart.size() > 0, "The checkout page does not contain any products!");

        // --- RIGA DI FINE TEST ---
        System.out.println("========================================");
        System.out.println("TEST COMPLETED SUCCESSFULLY");

        // 27. Print the total number of products added to the cart
        System.out.println("Total products added to cart: " + totalProducts);
        System.out.println("========================================");

        // 28. Close the browser and terminate the WebDriver session
        driver.quit();

    }
}
