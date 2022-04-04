package com.mintvelvet.test;

import com.github.javafaker.Faker;
import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.driver.DriverManager;
import com.mintvelvet.page.HomePage;
import com.mintvelvet.testdata.TestData;
import com.mintvelvet.utils.DataProviderUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends  BaseTest {



    @FrameworkAnnotation
    @Test(dataProvider = "getData2",dataProviderClass = DataProviderUtils.class ,description = "To check whether the search returns the correct results")
    public void checkOutAsGuest(TestData testData) throws InterruptedException {

        HomePage homepage=new HomePage();
                String strActualCheckOutTitle =homepage
                .clickAcceptCookies()
                .clickIconMobileSearch()
                .clickTextSearchBox()
                .setSearchBox(testData.searchItem)
                .clickIconSearch()
                .clickProductByName(testData.searchItem)
                        .clickLengthLong()
                        .clickChooseTheSize()
                        .clickDefaultSize10()
                        .clickAddonBag()
                        .clickCheckOut()
                        .clickBtnGuestCheckoutJourney()
                        .clicktxtGuestFirstName()
                        .setGuestFirstName(new Faker().name().firstName())
                        .clicktxtGuestLastName()
                        .setGuestLastName(new Faker().name().lastName())
                        .clictxtGuestEmail()
                        .setGuestEmail(new Faker().internet().emailAddress())
                        .clickCheckoutJourneyGuestlogin()
                        .getCheckOutTitleHeader();

        Assert.assertEquals(strActualCheckOutTitle,"Checkout" );
    }

}
