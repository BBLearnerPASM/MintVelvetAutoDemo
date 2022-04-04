package com.mintvelvet.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.mintvelvet.utils.ScreenshotUtils;

public final class ExtentLogger {

    public ExtentLogger(){}



    public static void pass(String message){


        ExtentManager.getExtent().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());

    }

    public static void fail(String message){

       // ExtentManager.getExtent().fail(MarkupHelper.createLabel(message, ExtentColor.RED));
        ExtentManager.getExtent().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
    }

    public static void info(String message){

        ExtentManager.getExtent().info(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());


    }



}
