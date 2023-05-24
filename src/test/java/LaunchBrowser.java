import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {


    public static void main(String[] args){

//        System.setProperty("webdriver.chrome.driver","C:\\Users\\nitis\\Downloads\\chromedriver\\chromedriver.exe");
//         WebDriver driver=new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\nitis\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//        WebDriver driver=new FirefoxDriver();

//        System.setProperty("webdriver.edge.driver","C:\\Users\\nitis\\Downloads\\edgedriver\\msedgedriver.exe");
//        WebDriver driver=new EdgeDriver();

       // -----------------------------//

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();






    }
}
