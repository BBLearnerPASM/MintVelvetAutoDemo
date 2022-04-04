package com.mintvelvet.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mintvelvet.contants.FrameworkContants;

public final class ExtentReport {

    private ExtentReport(){}


    private static ExtentReports extent ;
    private static ExtentSparkReporter spark;
    private static ExtentTest test;


    public static void initReport(){

        extent = new ExtentReports();
        spark = new ExtentSparkReporter(FrameworkContants.REPORT_PATH);
        extent.attachReporter(spark);

    }



    public static void flushReport(){

        extent.flush();
    }

    public static void createTest(String name) {
        test =extent.createTest(name);
        ExtentManager.setExtent(test);

    }

    public static void AssignAuthor(String name) {

        ExtentManager.getExtent().assignAuthor(name);

    }


}
