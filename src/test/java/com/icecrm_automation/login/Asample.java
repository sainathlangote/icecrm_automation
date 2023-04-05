package com.icecrm_automation.login;

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
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class Asample extends BaseClass{
	 @BeforeGroups(groups = {"sanity"})
	    public void beforeGroups(){
	        System.out.println("This is before group method");
	    }

	    @AfterGroups(groups = {"sanity"})
	    public void afterGroups(){
	        System.out.println("This is after group method");
	    }
	@BeforeSuite(groups= {"sanity"})
	public void beforesuite() {
		System.out.println("A--beforesuite---A");
	}
	@AfterSuite(groups= {"sanity"})
	public void aftersuite() {
		System.out.println("A--aftersuite--A");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("B--beforetest---A");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("B--aftertest---A");
	}
	@BeforeClass()
	public void beforeclass() {
		System.out.println("C--beforeclass---Asample");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("C--afterclass--ASample");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("D--beforemethod--Asample");
	}
	
	@AfterMethod
		public void aftermethod() {
			System.out.println("D--aftermethod--Asample");
		}

		@Test(groups= {"sanity"})
		public void test1() {
			System.out.println("TEST1--Asample class");
			System.out.println(driver.getTitle());
		}
		
	}


