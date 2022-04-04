package com.mintvelvet.utils;

import com.mintvelvet.config.ConfigFactory;
import com.mintvelvet.driver.DriverManager;
import com.mintvelvet.enums.WaitType;
import com.mintvelvet.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {



    public static void click(By by,String elementName )
    {
        WebElement element =waitUntilElementPresent(by);
        element.click();
        ExtentLogger.info(elementName + " is clicked successfully ");

    }

    public static void click(By by, String waitType , String elementName)
    {
        WebElement element = null;

        if(waitType.equalsIgnoreCase("presence"))
        {
             element = waitUntilElementPresent(by);
        }else if(waitType.equalsIgnoreCase("clikable"))
        {
            element = waitUntilElementClickable(by);
        }if(waitType.equalsIgnoreCase("visible"))
        {
         element = waitUntilElementVisible(by);
        }

        element.click();
        ExtentLogger.info(elementName + " is waited for and clicked successfully ");
    }

    public static void click(By by, WaitType waitType, String elementName)
    {
        WebElement element = null;

        if(waitType == WaitType.PRESENCE)
        {
            element = waitUntilElementPresent(by);
        }else if(waitType == WaitType.CLICKABLE)
        {
            element = waitUntilElementClickable(by);

        }if(waitType == WaitType.VISIBLE)
        {
            element = waitUntilElementVisible(by);
        }

        element.click();
        ExtentLogger.info(elementName + " is waited for and clicked successfully ");
    }

    public static void sendKeys(By by, String value , String elementName)
    {
        WebElement element =waitUntilElementPresent(by);
        element.sendKeys(value);
        ExtentLogger.info("Enter the value  '" + value + "' successfully in the element " + elementName);
    }

    public static String getText(By by, String elementName)
    {
        WebElement element =waitUntilElementPresent(by);
        String text =element.getText();
        ExtentLogger.info("Text of the element is displayed as '"+ text +"'" ) ;
        return text ;

    }




    private static WebElement waitUntilElementPresent(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementClickable(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    private static WebElement waitUntilElementVisible(By by)
    {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }





    public static By getProductItemByName(String productName){
        return By.xpath("//a[normalize-space()='"+productName+"']");
    }



}
