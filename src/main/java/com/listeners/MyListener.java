package com.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utilities.ExtentReportManager;
import com.utilities.ScreenshotUtil;

public class MyListener implements ITestListener, ISuiteListener 
{

	@Override
	public void onStart(ISuite suite) 
	{
		System.out.println("Suite Started");
		ExtentReportManager.createExtentReport(suite.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started");
		ExtentReportManager.createTest( result.getName() );
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " :: Test Passesd");
		ExtentReportManager.pass(result.getName() + " Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		ExtentReportManager.fail( result.getThrowable().toString() );
		String path = ScreenshotUtil.takeScreenshot("flipkartAppOpen");
		ExtentReportManager.addScreenshot(path);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ExtentReportManager.skip( result.getName()+ " Test Skipped");
	}
	
	@Override
	public void onFinish(ISuite suite)
	{
		System.out.println("Suite Ended");
		ExtentReportManager.publishReport();
	}

}






