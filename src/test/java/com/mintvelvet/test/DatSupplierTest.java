package com.mintvelvet.test;

import com.mintvelvet.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DatSupplierTest {



    @Test(dataProvider = "getData")
    public void dataSupplierTest(String username) {

        System.out.println(username);

    }



    @Test(dataProvider = "getData2")
    public void dataSupplierTest2(TestData testData) {

        System.out.println(testData.searchItem);
        System.out.println(testData.testCaseName);
        System.out.println(testData.testNumber);


    }

    @DataSupplier
    public List<String> getData(){

        List<String> list = Arrays.asList("test", "test2");
        return list;
    }


    @DataSupplier
    public StreamEx<TestData> getData2(){


        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read();
    }




}
