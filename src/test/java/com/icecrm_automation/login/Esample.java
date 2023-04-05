package com.icecrm_automation.login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Esample {
	
	@Parameters({"username" , "password"})
	@Test 
	public void sample(String username,String password) {
		System.out.println("this is test1 from Esample Class");
		System.out.println("this is test1 from Csample Class and username is :"+ username+ "password :"+ password);
	}
	@Parameters({"browser"})
	@BeforeClass
	public void beforeclass(String browser) {
		System.out.println("this is beforeclass from Esample Class");
		System.out.println("this is Csample class and browser value is: "+ browser);
	}
	}

	
