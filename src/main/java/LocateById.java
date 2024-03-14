import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateById {

    @Test
    public void testID(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://programautomatycy.pl/test-page/");
        WebElement bookTitle = driver.findElement(By.id("book-text"));
        bookTitle.sendKeys("Madzia");
        WebElement movieTitle=driver.findElement(By.name("your-movie"));
        bookTitle.sendKeys("Jurasic Park");
        WebElement numbersRadioButtons = driver.findElement(By.className("number"));
        WebElement footer = driver.findElement(By.tagName("footer"));
        WebElement coloursFullClassName = driver.findElement(By.cssSelector("select[class='wpcf7-form-control wpcf7-select colour']"));
        WebElement coloursClassName = driver.findElement(By.cssSelector(".colour"));
        WebElement number = driver.findElement(By.xpath("//input[@value=\"3\"]"));
        WebElement greenColour = driver.findElement(By.xpath("//option[@value=\"Zielony\"]"));
        List<WebElement> option =driver.findElements(By.tagName("option"));
        System.out.println(option);
        driver.quit();



    }
}
