package com.icecrm_automation.login;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Csample {

	@Parameters({"username","password"})
		@Test
		public void test(String username, String password) {
			System.out.println("this is test1 from Csample Class");
			System.out.println(username);
			System.out.println(password);
		
		}
	@Parameters("browser")
	@BeforeClass()
	public void beforeclass(String browser) {
		System.out.println("this is Csample class and browser value is: "+ browser);
	}
}
