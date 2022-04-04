package com.mintvelvet.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    public ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    static ExtentTest getExtent() {
        return threadLocal.get();
    }

    static void setExtent(ExtentTest test){

        threadLocal.set(test);
    }

}
