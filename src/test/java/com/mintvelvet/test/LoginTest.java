package com.mintvelvet.test;

import com.github.javafaker.Faker;
import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.driver.Driver;
import com.mintvelvet.driver.DriverManager;
import com.mintvelvet.page.HomePage;
import com.mintvelvet.page.SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{








    @FrameworkAnnotation(Author = "BB")
    @Test
    public void logintest() throws InterruptedException {

        String strSearchItem="jeans";


        HomePage homepage=new HomePage();
        homepage.clickAcceptCookies();
        homepage.clickIconMobileSearch();

        SearchPage searchpage= new SearchPage();
        searchpage.clickTextSearchBox();
        searchpage.setSearchBox(strSearchItem);
        Thread.sleep(2000);
        searchpage.clickIconSearch();
        String strExpectedSearchTitle=searchpage.getSearchTitleHeader();
        Assert.assertEquals("You searched for "+'"'+ strSearchItem +'"',strExpectedSearchTitle );

    }

    @FrameworkAnnotation(Author = "BB")
    @Test
    public void searchProductTestbyJeans() throws InterruptedException {

        String strSearchItem="jeans";


        HomePage homepage=new HomePage();
        String strExpectedSearchTitle =homepage
                .clickAcceptCookies()
                .clickIconMobileSearch()
                .clickTextSearchBox()
                .setSearchBox(strSearchItem)
                .clickIconSearch()
                .getSearchTitleHeader();


        Assert.assertEquals("You searched for "+'"'+ strSearchItem +'"',strExpectedSearchTitle );

    }

    @FrameworkAnnotation(Author = "BB")
    @Test
    public void fakeTest() throws InterruptedException {

        String strSearchItem = "jeans";
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            System.out.println(faker.commerce().productName());

        }


    }

}
