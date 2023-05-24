import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

    public  static void main(String[] java){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        driver.navigate().to("https://facebook.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
