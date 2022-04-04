package com.mintvelvet.page;

import com.mintvelvet.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class SearchPage {

    private static final By TXT_SEARCH_BOX =By.xpath("//input[@id='boost-pfs-search-box-style3']");
    public static final By ICON_SEARCH =By.xpath("//button[@class='boost-pfs-search-submit-style3']");
    public static final By HEADER_SEARCH_TITLE =By.xpath("//h2[@class='title section-title']");

    public SearchPage clickTextSearchBox(){
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).click();
        SeleniumUtils.click(TXT_SEARCH_BOX,"txt_Search_Box");

        return this;
    }



    public SearchPage setSearchBox(String strSearchItem) throws InterruptedException {
        //DriverManager.getDriver().findElement(TXT_SEARCH_BOX).sendKeys(strSearchItem);
        SeleniumUtils.sendKeys(TXT_SEARCH_BOX,strSearchItem,"txt_Search_Box");

        return this;

    }

    public SearchPage clickIconSearch() {
        SeleniumUtils.click(ICON_SEARCH,"icon_Search");
        //DriverManager.getDriver().findElement(ICON_SEARCH).click();
        return this;
    }

    public String getSearchTitleHeader(){

        //return DriverManager.getDriver().findElement(HEADER_SEARCH_TITLE).getText();
        return SeleniumUtils.getText(HEADER_SEARCH_TITLE,"header_search_tile");
    }

}
