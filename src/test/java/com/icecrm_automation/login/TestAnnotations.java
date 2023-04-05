package com.icecrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforeTest");
		
	}
	@AfterMethod 
	public void aftermethod() {
		System.out.println("AfterMEthod");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	@Test
	public void test() {
		System.out.println("Test method Annotation");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	
	

}
