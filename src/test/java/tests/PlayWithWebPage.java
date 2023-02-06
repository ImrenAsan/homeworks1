package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayWithWebPage{
    @Test
    public void play () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.infotechacademy.eu/");
        Thread.sleep(2000);

        Dimension d= new Dimension(300, 300);
        driver.manage().window().setSize(d);
        Thread.sleep(2000);

        Point p = new Point(150, 150);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);



        driver.close();
    }

}
