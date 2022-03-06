package com.crm.vtiger;

import org.testng.annotations.Test;

public class CreateProductTest {
	
	@Test(groups="smokeTest")
	public void createProductWithNameTest()
	{
		System.out.println("execute createProduct with name");
	}
	
	@Test(groups="regressionTest")
	public void createProductWithId()
	{
		System.out.println("execute createProduct with id");
	}

}