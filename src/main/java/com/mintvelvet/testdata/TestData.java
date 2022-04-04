package com.mintvelvet.testdata;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.converter.IntegerConverter;

public class TestData {

    @Column(name="testcasename", index = 0)
    public String testCaseName;
    @Column(name="searchitem", index =1 )
    public String searchItem;
    @Column(name="testnumber", index =2 ,converterClass = IntegerConverter.class)
    public int testNumber;


}
