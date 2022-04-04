package com.mintvelvet.page;

import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class GuestJourneyPage {


    private static final By BTN_GUESTCHECKOUTJOURNEY = By.xpath("//input[@id='GuestCheckoutJourney']");
    private static final By TXT_GUESTFIRSTNAME =By.xpath("//input[@id='GuestFirstName']");
    private static final By TXT_GUESTLASTNAME =By.xpath("//input[@id='GuestLastName']");
    private static final By TXT_GUESTEMAIL=By.xpath("//input[@id='GuestEmail']");
    private static final By BTN_GUEST_LOGIN =By.xpath("//span[@id='checkout_journey_guestlogin']");
    private static final By HEADER_CHECKOUT_TITLE =By.xpath("//h1[@class='custom-checkout-title']");

    public GuestJourneyPage clickBtnGuestCheckoutJourney(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_GUESTCHECKOUTJOURNEY,"GuestCheckoutJourney");

        return this;
    }

    public GuestJourneyPage clicktxtGuestFirstName(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(TXT_GUESTFIRSTNAME,"GuestFirstName");

        return this;
    }

    public GuestJourneyPage clicktxtGuestLastName(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(TXT_GUESTLASTNAME,"GuestLastName");

        return this;
    }

    public GuestJourneyPage clictxtGuestEmail(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(TXT_GUESTEMAIL,"GuestEmail");

        return this;
    }



    public GuestJourneyPage setGuestFirstName(String GuestFirstName) throws InterruptedException {
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).sendKeys(strSearchItem);
        SeleniumUtils.sendKeys(TXT_GUESTFIRSTNAME,GuestFirstName,"GuestFirstName");

        return this;

    }

    public GuestJourneyPage setGuestEmail(String GuestEmail) throws InterruptedException {
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).sendKeys(strSearchItem);
        SeleniumUtils.sendKeys(TXT_GUESTEMAIL,GuestEmail,"GuestEmail");

        return this;

    }

    public GuestJourneyPage setGuestLastName(String GuestLastName) throws InterruptedException {
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).sendKeys(strSearchItem);
        SeleniumUtils.sendKeys(TXT_GUESTLASTNAME,GuestLastName,"GuestLastName");

        return this;

    }


    public GuestJourneyPage clickCheckoutJourneyGuestlogin(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(BTN_GUEST_LOGIN,"CheckoutJourneyGuestlogin");

        return this;
    }

    public String getCheckOutTitleHeader(){

        //return DriverManager.getDriver().findElement(HEADER_SEARCH_TITLE).getText();
        return SeleniumUtils.getText(HEADER_CHECKOUT_TITLE,"custom-checkout-title'");
    }

}
