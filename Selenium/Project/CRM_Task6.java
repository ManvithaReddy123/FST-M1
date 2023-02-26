import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CRM_Task6 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        WebElement homePage = driver.findElement(By.xpath("//a[contains(text(),'Activities')]"));
        System.out.println("Activities menu item exists: " + homePage.isDisplayed());
        driver.close();
    }

}
