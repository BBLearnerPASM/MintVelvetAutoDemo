package com.mintvelvet.utils;

import com.mintvelvet.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

public class DataProviderUtils {


    @DataSupplier
    public StreamEx<TestData> getData2(Method method){


        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testdata->testdata.testCaseName.equalsIgnoreCase(method.getName()));
    }
}
