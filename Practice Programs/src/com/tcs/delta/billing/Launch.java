package com.tcs.delta.billing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Launch{
	@Test()
	@Parameters({"username","password"})
	public void sample1(String name, String password ) {
		System.out.println("The username:"+name);
		System.out.println("The password value:"+password);
	}
	@Test()
	@Parameters({"username","password"})
	public void sample2(String name, String password ) {
		System.out.println("The username:"+name);
		System.out.println("The password value:"+password);
	
}
}
