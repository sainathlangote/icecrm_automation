package com.icecrm_automation.utility;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//public class TestListeners implements ITestListener, ISuiteListener {
	/*String reportPath;
	ExtentReports extentReports;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("This is onStart of ISuite form TestListeners");
		LocalDateTime dateTime = LocalDateTime.now();
		String currentDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
		reportPath = System.getProperty("user.dir") + "/reports/" + "report_" + currentDateTime;
		File file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir(); // create folder based on provided folder path
		}
		String htmlReport = reportPath + "/AutomationReport.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(htmlReport);
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("This is onFinish of ISuite from TestListeners");

		extentReports.flush();
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is onStart of ITestContext from TestListeners");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish of ITestContext from TestListeners");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is onTestStart of ITestResult from TestListeners");
		String methodName = result.getMethod().getMethodName();
//	        ExtentTest log = extentReports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is onTestSuccess of ITestResult from TestListeners");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This is onTestFailure of ITestResult from TestListeners");
//	        String screenshot= reportPath+"/"+ result.getMethod().getMethodName()+".jpg";
//	        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//	        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//	        File dstFile =  new File(screenshot);
//	        try {
//	            FileUtils.copyFile(srcFile, dstFile);
//	        } catch (IOException e) {
//	            throw new RuntimeException(e);
//	        }
//	        ExtentTest log = null;
//			log.fail(result.getThrowable().getMessage());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is onTestSkipped of ITestResult from TestListeners");
	}

}*/
	public class TestListeners implements ITestListener, ISuiteListener {

//		String reportPath;
//		ExtentReports extentReporter;

		@Override
		public void onStart(ISuite suite) { // ISuiteListener
			System.out.println("This is onStart of ISuite from TestListners");
		}

		@Override
		public void onFinish(ISuite suite) { // ISuiteListener
			System.out.println("This is onFinish of ISuite from TestListners");
			//extentReporter.flush();
		}

		@Override
		public void onStart(ITestContext context) {
			System.out.println("This is onStart of ITestContext from TestListners");
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("This is onFinish of ITestContest from TestListners");
			ExtentTestManager.endTest();
		}

		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("This is onTestStart of ITestResult from TestListners");
			String methodName = result.getMethod().getMethodName();
			ExtentTestManager.createTest(methodName);
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("This is onTestSuccess of ITestResult from TestListners");
//			captureScreenShot(result);
			
			/*
			 * System.out.println("ReportPath is "+ reportPath); String screenShotPath =
			 * reportPath + "/" + result.getMethod().getMethodName() + ".jpg";
			 * System.out.println("ScreenShot file name "+screenShot);
			 * 
			 * TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
			 * System.out.println("Take screenShot "+takesScreenshot); File sourceFile =
			 * takesScreenshot.getScreenshotAs(OutputType.FILE); File destinationFile = new
			 * File(screenShot);
			 * 
			 * try { FileUtils.copyFile(sourceFile, destinationFile); } catch (IOException
			 * e) { // e.printStackTrace(); throw new RuntimeException(e); }
			 */
			//log.fail(result.getThrowable().getMessage());
			//log.addScreenCaptureFromPath(screenShotPath, "Failed screenshot");
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("This is onTestFailure of ITestResult from TestListners");
			ExtentTestManager.getTest().fail(result.getThrowable());
//			captureScreenShot(result);
			/*
			 * String screenShot = reportPath + "/" + result.getMethod().getMethodName() +
			 * ".jpg"; TakesScreenshot takesScreenshot = (TakesScreenshot) driver; File
			 * sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE); File
			 * destinationFile = new File(screenShot);
			 * 
			 * try { FileUtils.copyFile(sourceFile, destinationFile); } catch (IOException
			 * e) { // e.printStackTrace(); throw new RuntimeException(e); }
			 */
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("This is onTestSkipped of ITestResult from TestListners");
		}
	}
