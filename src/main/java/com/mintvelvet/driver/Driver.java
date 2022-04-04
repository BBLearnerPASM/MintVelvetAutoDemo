package com.mintvelvet.driver;

import com.mintvelvet.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public final class Driver {

    private Driver(){}



 //Common for all thread



    public static void initDriver(){


            WebDriver driver = DriverFactory.getDriver(ConfigFactory.getConfig().browser());
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());

    }


    public static void quitDriver()
    {



            DriverManager.getDriver().quit();

    }


}
