package com.tests.bankingApp;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;

public class HDFCBank extends BaseTest
{
	@Test(groups = {"bank","regression"})
	public void hdfcTest() 
	{
		
		drivers.get().get("https://www.hdfc.bank.in/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
