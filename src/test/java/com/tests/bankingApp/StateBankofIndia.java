package com.tests.bankingApp;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;

public class StateBankofIndia extends BaseTest
{
	@Test(groups = {"bank","regression"})
	public void sbiTest() 
	{
		drivers.get().get("https://onlinesbi.sbi.bank.in/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
