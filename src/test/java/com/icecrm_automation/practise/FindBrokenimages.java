package com.icecrm_automation.practise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icecrm_automation.utility.BaseClass;

public class FindBrokenimages extends BaseClass {

	@BeforeClass
	public void beforeclass() {
		System.out.println("LAunching browser amazon");
		luanchBrowser("edge");
		driver.navigate().to("https://www.amazon.in/");
	}

	@Test
	public void verifybrokenimages() {
		List<WebElement> links = driver.findElements(By.tagName("img")); // firstly findout the tag whre links
																			// Associated
		for (int i = 0; i < links.size(); i++) { // iterate one by one
			WebElement element = links.get(i); // get one by one link
			String url = element.getAttribute("src"); // find Link associated in href atribute
//			if(url!= null && !url.equals("javascript: void(0)")) {        //apply condition
			try {
				URL uri = new URL(url); // convert tring url into actual url
				URLConnection urlConnection = uri.openConnection(); // open the URL connection
				HttpURLConnection httpURLconnection = (HttpURLConnection) urlConnection; // upcast urlConnection in
																							// HttpURLConnection
				httpURLconnection.connect(); // hitting the Url
				int statuscode = httpURLconnection.getResponseCode(); // get the status code of an url if >200 means it
																		// is broken url
				if (statuscode > 200) {
					System.out.println("Broken Url : " + " statuscode: " + statuscode + " url: " + url); // print broken
																											// links
				}
				httpURLconnection.disconnect(); // disconnect connection
			} catch (Exception ignored) {
			}
		}

	}

	@AfterClass
	public void afterclass() {
		String url2 = driver.getTitle();
		System.out.println(url2);
//driver.close();
		driver.quit();

	}
}
