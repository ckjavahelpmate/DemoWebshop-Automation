package com.tests.food;

import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;


public class ZomatoTest extends BaseTest {
	
	@Test( groups = {"food", "regression"})
	public void zomatoAppOpen() {
		String username = System.getenv("API_USERNAME");
		String password = System.getenv("API_PASSWORD");
		
		System.out.println("===========================================================================");
		System.out.println("Username : "+ username);
		System.out.println("Pasword : "+ password);
		System.out.println("===========================================================================");
		
		drivers.get().get("https://www.zomato.com");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
