import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRM_Task2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        WebElement URL = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        System.out.println("URL of the Source image is: "+URL.getAttribute("src"));
        driver.close();
    }
}

