package com.mintvelvet.page;

import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class CheckOutPage {


    private static final By BTN_CHECKOUT = By.xpath("//a[text()='CHECKOUT']");


    public GuestJourneyPage clickCheckOut(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_CHECKOUT," checkout  button");

        return new GuestJourneyPage();
    }
}
