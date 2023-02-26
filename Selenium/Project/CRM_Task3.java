import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CRM_Task3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String copyRightText = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println(copyRightText);
        driver.close();
    }

}