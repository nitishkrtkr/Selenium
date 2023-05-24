import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.id("email"));

        email.sendKeys("7488018445");
       // email.clear();

        System.out.println(email.getAttribute("placeholder"));
        System.out.println(email.getText());  //give text<input name id value>xxx</input>

        WebElement login=driver.findElement(By.name("login"));
        System.out.println(login.getAttribute("class"));
        System.out.println(login.getAttribute("data-testid"));
        System.out.println(login.getAttribute("type"));
        System.out.println(login.getAttribute("id"));

        System.out.println("Text is-->"+login.getText());

        driver.close();

        //getText--returns inner text of an elemnt
        //get Attribute-return the text contained by an attribute in an html doc



    }



}
