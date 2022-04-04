package com.mintvelvet.test;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.driver.Driver;
import com.mintvelvet.driver.DriverManager;
import com.mintvelvet.page.HomePage;
import com.mintvelvet.page.SearchPage;
import com.mintvelvet.testdata.TestData;
import com.mintvelvet.utils.DataProviderUtils;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SearchTest extends BaseTest {

    @DataProvider
    public static Object[][] getData(){
        return new Object[][]  { {"jeans"} ,{"tops"}};
    }

    @FrameworkAnnotation
    @Test(dataProvider = "getData2",dataProviderClass = DataProviderUtils.class ,description = "To check whether the search returns the correct results")
    public void searchProductTest(TestData testData) throws InterruptedException {

        //String strSearchItem="tops";

     /*   HomePage homepage=new HomePage();
        homepage.clickAcceptCookies();
        homepage.clickIconMobileSearch();

        SearchPage searchpage= new SearchPage();
        searchpage.clickTextSearchBox();
        searchpage.setSearchBox(strSearchItem);

        searchpage.clickIconSearch();
        String strExpectedSearchTitle=searchpage.getSearchTitleHeader();
        Assert.assertEquals("You searched for "+'"'+ strSearchItem +'"',strExpectedSearchTitle );*/

        HomePage homepage=new HomePage();
        String strExpectedSearchTitle =homepage
                .clickAcceptCookies()
                .clickIconMobileSearch()
                .clickTextSearchBox()
                .setSearchBox(testData.searchItem)
                .clickIconSearch()
                .getSearchTitleHeader();

        Assert.assertEquals("You searched for "+'"'+ testData.searchItem +'"',strExpectedSearchTitle );

       /* DriverManager.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(1000);
        DriverManager.getDriver().findElement(By.xpath("//input[@id='boost-pfs-search-box-0']")).click();
        Thread.sleep(1000);
        DriverManager.getDriver().findElement(By.xpath("//input[@id='boost-pfs-search-box-style3']")).sendKeys(strSearchItem);
        DriverManager.getDriver().findElement(By.xpath("//button[@class='boost-pfs-search-submit-style3']")).click();
        String strExpectedSearchTitle=DriverManager.getDriver().findElement(By.xpath("//h2[@class='title section-title']")).getText().trim();
        Assert.assertEquals("You searched for "+'"'+ strSearchItem +'"',strExpectedSearchTitle );*/

    }





}
