import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {


    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

      //Difference between findElement and findElements

        driver.get("https://www.nopcommerce.com");

        WebElement button = driver.findElement(By.xpath("//*[@class=\"btn blue-button\"]"));
        System.out.println(button.getText());

        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"stats-img\"]"));

        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));

   //returns null/ zero even the web element is not present--in findElemnts
        List<WebElement> list2 = driver.findElements(By.xpath("//*[@class=\"stats-k\"]"));
        System.out.println(list2);
        System.out.println(list2.size());

        //ERROR-->NoSuchElementException: no such element:
        // Unable to locate element: {"method":"xpath","selector":"//*[@class="stats-k"]
        WebElement list3 = driver.findElement(By.xpath("//*[@class=\"stats-k\"]"));
        System.out.println(list3);
       // System.out.println(list2.size());
        System.out.println("haha");

        driver.close();

//the flow breaks/fail then the rest doesnot gets executed;


    }
}
