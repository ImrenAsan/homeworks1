package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2Selenium {

    WebDriver driver = new ChromeDriver();
    @Before
    public void setup() throws InterruptedException{
        driver.get("https://gcreddy.com/project/admin/login.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }

    @After
    public void tearDown(){
        driver.close();

    }

    @Test
    public void linkTest () throws InterruptedException{

        WebElement username = driver.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/input"));
        username.sendKeys("gcreddy"); Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"contentText\"]/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td/input"));
        password.sendKeys("Temp@2020"); Thread.sleep(1000);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]"));
        login.click();

        WebElement customers = driver.findElement(By.xpath("//*[@id=\"ui-accordion-adminAppMenu-header-2\"]"));
        customers.click(); Thread.sleep(1000);
        ////*[@id="ui-accordion-adminAppMenu-header-2"]/a

        WebElement subCustomers = driver.findElement(By.xpath("//*[@id=\"ui-accordion-adminAppMenu-panel-2\"]/ul/li/a"));
        subCustomers.click();

        WebElement edit = driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]"));
        edit.click();




    }

}
