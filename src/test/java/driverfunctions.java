import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class driverfunctions {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        System.out.println("The title is-->" + driver.getTitle());
        System.out.println("The current title is-->"+driver.getCurrentUrl());
        System.out.println("PageSource"+driver.getPageSource());
        System.out.println("WindowHandle is-->"+driver.getWindowHandle());
        Set<String> s=driver.getWindowHandles();
        System.out.println(s);

        driver.navigate().to("https://www.nopcommerce.com/");






        driver.close();











    }
}
