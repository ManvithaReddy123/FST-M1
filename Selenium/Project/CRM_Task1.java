import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CRM_Task1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        String expectedTitle = driver.getTitle();
        System.out.println(expectedTitle);
        String actualTitle = "SuiteCRM";
        if(expectedTitle.equals(actualTitle))
            System.out.println("Title of the website is: " + expectedTitle);
        else
            System.out.println("Title of the website didn't match");
        driver.close();
    }

}

