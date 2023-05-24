import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//Need of a website having such requirements.
//for multiple dropdown--no need to create multiple select object.
        driver.get("https://www.amazon.com");

        //for using selecty class--in html code the select attribute should be there for the code.

        WebElement item1 = driver.findElement(By.id("searchDropdownBox1"));
        SelectOptionFromDropDown(item1, "fashio");

        WebElement item2 = driver.findElement(By.id("searchDropdownBox2"));
        SelectOptionFromDropDown(item2, "Books");

        WebElement item3 = driver.findElement(By.id("searchDropdownBox3"));
        SelectOptionFromDropDown(item1, "cloths");

    }

    public static void SelectOptionFromDropDown(WebElement items, String str) {

        Select it = new Select(items);

        List<WebElement> Element = it.getOptions();

        for (WebElement x : Element) {
            if (x.getText().equals(str)) {
                x.click();
                break;
            }
        }
    }
}
