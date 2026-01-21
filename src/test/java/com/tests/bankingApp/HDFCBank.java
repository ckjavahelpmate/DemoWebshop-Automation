package com.tests.bankingApp;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;
import com.listeners.MyAutoRetry;

public class HDFCBank extends BaseTest
{
	@Test(groups = {"bank","regression"}, retryAnalyzer = MyAutoRetry.class)
	public void hdfcTest() 
	{
		
		drivers.get().get("https://www.hdfc.bank.in/");
		
//		throw new ArithmeticException();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
