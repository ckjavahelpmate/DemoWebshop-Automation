package com.tests.ecommerce;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlibrary.BaseTest;

public class AmazonTest extends BaseTest {

	
	@Test( groups = { "ecommerce", "smoke" , "regression"}  )
	public void amazonAppOpen( ) 
	{	
		drivers.get().get("https://www.Amazon.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue(false);
	}

}



//