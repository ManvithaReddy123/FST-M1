import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class CRM_Task7 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sales')])[1]")).click();
        driver.findElement(By.xpath("((//a[contains(text(),'Sales')])[1])//parent::span[1]/ul/li/a[contains(text(),'Leads')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")));
        driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
        String phoneNum = driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Phone Number has: " + phoneNum);
        driver.close();
    }

}
