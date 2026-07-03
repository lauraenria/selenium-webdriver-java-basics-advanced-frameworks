import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

    public static void main(String[] args) {

        // 1. Give me the count of links on the page.
        // a

        WebDriver driver = new ChromeDriver();

        driver.get("http://qaclickacademy.com/practice.php");

        int allLinks = driver.findElements(By.tagName("a")).size();

        System.out.println("Totale links nella pagina: " + allLinks);

        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        int footerLinks = footerdriver.findElements(By.tagName("a")).size();

        System.out.println("Links nel footer: " + footerdriver.findElements(By.tagName("a")).size());
    }
}
