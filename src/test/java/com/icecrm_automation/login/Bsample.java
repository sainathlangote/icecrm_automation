package com.icecrm_automation.login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bsample {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("A--beforesuite--B");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("A--aftersuite---B");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("B--beforetest---B");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("B--aftertest---B");
	}
	@BeforeClass()
	public void beforeclass() {
		System.out.println("C--beforeclass---Bsample");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("C--afterclass--Bsample");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("D--beforemethod--Bsample");
	}
	
	@AfterMethod
		public void aftermethod() {
			System.out.println("D--aftermethod--Bsample");
		}

		@Test(groups= {"sanity"})
		public void test1() {
			System.out.println("TEST1--Bsample class");
		}
}
