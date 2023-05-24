import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args){

        //Select class
        // select by visibleText
        //select by value
        //select by index

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement item = driver.findElement(By.id("searchDropdownBox"));

        Select itemName=new Select(item);

        itemName.selectByVisibleText("Books");

        //value of value attribute

        itemName.selectByValue("search-alias=beauty");

        //By index--starts from 0;

        itemName.selectByIndex(7);

        //Selecting without using methods

        List<WebElement> alllist = itemName.getOptions();//give all options as webelemnts

        for(WebElement x:alllist){
            if(x.getText().equals("Amazon Fashion")){
                x.click();
                break;
            }
        }


    }

}
