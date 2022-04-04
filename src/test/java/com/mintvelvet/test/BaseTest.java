package com.mintvelvet.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mintvelvet.config.FrameworkConfig;
import com.mintvelvet.driver.Driver;
import com.mintvelvet.reports.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {



    @BeforeMethod
    public void setUp() {

        Driver.initDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }


}
