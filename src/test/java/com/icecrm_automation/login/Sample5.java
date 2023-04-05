package com.icecrm_automation.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.*;

public class Sample5 {
	@Test
	public void test1() {
		System.out.println("This is test1 from sample 5 class");
		Object[][] obj = new Object[][] { { 1, 2 }, { 3, 4 } };
		System.out.println(obj[0][0]); // 1 will output
		System.out.println(obj[0][1]); // 2 will output
		System.out.println(obj[1][0]); // 3 will output
		System.out.println(obj[1][1]); // 4 will output

	}

	@Test(dataProvider = "provider")
	public void test2(int a, int b) {
		System.out.println(a + "  " + b);
	}

	@DataProvider
	public Object[][] provider() {
		return new Object[][] { { 1, 2 }, { 3, 4 } };
	}

	@DataProvider
	public Object[][] credentials() {
		return new Object[][] { { "sai", "password1" },
			    { "Darshan", "Password2" },
		     	{ "Nikhil", "password3" },
				{ "Rohan", "Password4" },
				{ "username1", null },
				{ "username2", false },
				{ "username", "43" } };

	}

	@Test(dataProvider = "credentials")
	public void test3(String username, String password) {
		System.out.println("username: " + username + "  password: " + password);
	}
	
	
//	@DataProvider
//	public Object[][] credentialss() {
//		return new Object[][] { { "sai", 12 },
//			    { "Darshan", 23 },
//		     	{ "Nikhil", 45 },
//				{ "Rohan", 56},
//				{ "username1", null },
//				{ "username2", false },
//				{ "username", 67 } };
//
//	}
//
//	@Test(dataProvider = "credentials")
//	public Object test4(String username1, int password1) {
//		System.out.println("username: " + username1 + "  password: " + password1);
//		return password1;,
//	}
}
