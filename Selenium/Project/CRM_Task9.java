import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class CRM_Task9 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@name ='Login']")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sales')])[1]")).click();
        driver.findElement(By.xpath("((//a[contains(text(),'Sales')])[1])//parent::span[1]/ul/li/a[contains(text(),'Leads')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Leads')]")));
        //driver.switchTo().frame("ajaxUI-history-iframe");
        List<WebElement> rowsList = driver.findElements(By.xpath("//tbody/tr"));
        for(int i=1; i<=10; i++){
            int j = i+1;
            String name = driver.findElement(By.xpath("((//tbody/tr)["+j+"]/td)[3]/b/a")).getText();
            String user = driver.findElement(By.xpath("((//tbody/tr)["+j+"]/td)[8]/a")).getText();
            System.out.println(i+" Name is: "+name+" --> "+i+" user is: "+user);
        }
        driver.close();
    }

}
