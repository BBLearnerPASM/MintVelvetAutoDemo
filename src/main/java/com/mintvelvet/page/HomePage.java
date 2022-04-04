package com.mintvelvet.page;

import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class HomePage {

    private static final By BTN_ACCEPT_COOKIES =By.xpath("//button[@id='onetrust-accept-btn-handler']");
    private static final By ICON_MOBILE_SEARCH =By.xpath("//input[@id='boost-pfs-search-box-0']");


    public HomePage clickAcceptCookies(){

        //DriverManager.getDriver().findElement(BTN_ACCEPT_COOKIES).click();
        SeleniumUtils.click(BTN_ACCEPT_COOKIES,"btn_Accept_Cookies");

        return this;
    }

    public SearchPage clickIconMobileSearch(){

        //DriverManager.getDriver().findElement(ICON_MOBILE_SEARCH).click();

        SeleniumUtils.click(ICON_MOBILE_SEARCH, "icon_mobile_Search");
        return new SearchPage();
    }




}
