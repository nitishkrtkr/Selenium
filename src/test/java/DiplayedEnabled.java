import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiplayedEnabled {

    public static void main(String[] args){

        //*[@name="email"]

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.facebook.com");

        WebElement email=driver.findElement(By.xpath("//*[@name=\"email\"]"));
//isDisplayed() is capable to check for the presence of all kinds of web elements available.
// isEnabled() is the method used to verify if the web element is enabled or disabled within the webpage.
// isEnabled() is primarily used with buttons.


        System.out.println(email.isDisplayed());
        System.out.println(email.isEnabled());

        //isSelected()
        //This method is often used on radio buttons,
        // checkboxes or options in a menu.
        // It is used to determine is an element is selected.
        // If the specified element is selected, the value returned is true.
        // If not, the value returned is false.
        System.out.println(email.isSelected());

        driver.close();



    }
}
