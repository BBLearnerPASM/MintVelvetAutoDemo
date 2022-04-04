package com.mintvelvet.driver;

import com.mintvelvet.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    public static WebDriver getDriver (String browserName) {
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.setBinary(ConfigFactory.getConfig().chromebinarypath());
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        else if(browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        
        return driver;
    }

}
