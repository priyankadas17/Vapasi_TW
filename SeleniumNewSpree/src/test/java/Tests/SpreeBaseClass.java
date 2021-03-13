package Tests;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//@Listeners(listeners.ListenersPage.class)

public class SpreeBaseClass implements ITestListener {
    public static WebDriver driver;


    @BeforeTest
    public void setUpDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/priyankadas/Downloads/chromedriver") ;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://spree-vapasi.herokuapp.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    /** public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws IOException {
        Date d = new Date();
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        try {
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("/Users/priyankadas/Documents/PriyankaRep/SeleniumSpree/src/Screenshot" +this.getClass().getName()+"_" +d + "_screenshot.png");
            File.copy(srcFile,destFile);
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }**/

}
