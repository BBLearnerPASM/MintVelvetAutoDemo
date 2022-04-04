package com.mintvelvet.listeners;

import com.mintvelvet.annotations.FrameworkAnnotation;
import com.mintvelvet.reports.ExtentLogger;
import com.mintvelvet.reports.ExtentManager;
import com.mintvelvet.reports.ExtentReport;
import org.apache.logging.log4j.EventLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result)
    {
        ExtentReport.createTest(result.getName());
         ExtentReport.AssignAuthor(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).Author());
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        ExtentLogger.pass(result.getName() + " is passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        ExtentLogger.fail(result.getName() + " is failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));

    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        ExtentLogger.info(result.getName() + " is skipped");
    }



    @Override
    public void onStart(ITestContext context)
    {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ITestContext context)
    {
        ExtentReport.flushReport();
    }
}
