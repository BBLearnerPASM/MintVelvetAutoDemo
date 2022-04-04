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
import org.apache.commons.math3.analysis.function.Abs;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SearchTest extends BaseTest {



    @FrameworkAnnotation(Author = "BiBi")
    @Test(dataProvider = "getData2",dataProviderClass = DataProviderUtils.class ,description = "To check whether the search returns the correct results")
    public void searchProductTest(TestData testData) throws InterruptedException {



        HomePage homepage=new HomePage();
        String strActualSearchTitle =homepage
                .clickAcceptCookies()
                .clickIconMobileSearch()
                .clickTextSearchBox()
                .setSearchBox(testData.searchItem)
                .clickIconSearch()
                .getSearchTitleHeader();

        Assert.assertEquals(strActualSearchTitle, "You searched for "+'"'+ testData.searchItem +'"' );



    }





}
