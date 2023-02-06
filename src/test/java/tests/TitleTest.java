package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

    @Test
    public void title () throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://infotechacademy.eu/");
        driver.manage().window().maximize();

        String expectedTitle = "Info Tech Academy - The Source of Change";
        String actualTitle = driver.getTitle();
        System.out.println("title = " + actualTitle);

        String expectedUrl = "https://infotecacademy.eu/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("url = " + actualUrl);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Basarili");
        }
        else {
            System.out.println("FAIL!!");
        }

        Assert.assertEquals(expectedUrl, actualUrl);
        driver.close();
    }
}
