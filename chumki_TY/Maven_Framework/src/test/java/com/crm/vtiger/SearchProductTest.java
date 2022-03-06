package com.crm.vtiger;

import org.testng.annotations.Test;

public class SearchProductTest {

	@Test(groups="smokeTest")
	public void searchProductWithNameTest()
	{
		System.out.println("execute searchProduct with name");
	}
	
	@Test(groups="regressionTest")
	public void searchProductWithId()
	{
		System.out.println("execute searchProduct with id");
	}
	
}