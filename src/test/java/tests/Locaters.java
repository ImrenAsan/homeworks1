package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locaters {

    WebDriver driver = new FirefoxDriver();

    @Before
    public void setup() throws InterruptedException{
        driver.get("https://www.infotechacademy.eu/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

    }

    @After
    public void tearDown(){
        driver.close();

    }

    @Test
    public void linkTest (){



    }

}
