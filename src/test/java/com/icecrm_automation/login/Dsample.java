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

public class Dsample {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("A--beforesuite--D");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("A--aftersuite--D");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("B--beforetest--D");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("B--aftertest--D");
	}
	@BeforeClass()
	public void beforeclass() {
		System.out.println("C--beforeclass---D");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("C--afterclass---D");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("D--beforemethod---D");
	}
	
	@AfterMethod
		public void aftermethod() {
			System.out.println("D--aftermethod----D");
		}

		@Test
		public void test() {
			System.out.println("TEST");
		}

}
