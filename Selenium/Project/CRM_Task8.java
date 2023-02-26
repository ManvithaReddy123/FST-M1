import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class CRM_Task8 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sales')])[1]")).click();
        driver.findElement(By.xpath("((//a[contains(text(),'Sales')])[1])//parent::span[1]/ul/li/a[contains(text(),'Accounts')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Accounts')]")));
        //driver.switchTo().frame("ajaxUI-history-iframe");
        List<WebElement> rowsList = driver.findElements(By.className("oddListRowS1"));
        for(int i=1; i<=5; i++){
            String name = driver.findElement(By.xpath("(//tr[@class='oddListRowS1'])["+i+"]/td/b")).getText();
            System.out.println(i + "Name is: "+ name);
        }
        driver.close();
    }

}
