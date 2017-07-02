package com.practise;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import io.appium.java_client.MobileElement;
public class LaunchAppiumServer {
	//public AndroidDriver<MobileElement> driver;
	WebDriver driver;
	public DesiredCapabilities cap;
	public AppiumDriverLocalService service;
	ExtentReports report;
	ExtentTest logger;
	String destination=null;
	File source=null;
	@BeforeTest
	public void startServer()
	{
		logger=report.startTest("startServer");
		report=new ExtentReports("F:\\Practise\\Practise\\test-output\\report.html",true);
		report.addSystemInfo("HostName", "Uddish").addSystemInfo("Environment", "Mobile")
			  .addSystemInfo("Username", "Kumar");
		
		//extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js"))
				.withIPAddress("127.0.0.1").usingPort(4723)
				.withLogFile(new File("F:\\Practise\\Logfiles\\logs.txt")));
				logger.log(LogStatus.PASS, "Driver created successfully");
	}
	@Test(priority=1)
	public void startingAppiumServer() throws InterruptedException, IOException
	{
		logger=report.startTest("startingAppiumServer");
		service.start();
		Thread.sleep(5000);
		System.out.println("1st priority");
		File appDir = new File("F:\\Practise\\Practise\\apkfiles\\");
		File app = new File(appDir, "net.one97.paytm-5.8.1@APK4Fun.com.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "484ac266");
		capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		capabilities.setCapability("app", app.getAbsolutePath()); //app.getAbsolutePath()
		capabilities.setCapability("noReset","true");
		// Here we mention the app's package name, to find the package name we have to convert .apk file into java class files
		capabilities.setCapability("app-package","net.one97.paytm");
		//Here we mention the activity name, which is invoked initially as app's first page.
		capabilities.setCapability("app-activity","net.one97.paytm.AJRJarvisSplash");
		//KeyguardManager keyguardManager = (KeyguardManager)getSystemService(); 
	//	KeyguardLock lock = keyguardManager.newKeyguardLock(KEYGUARD_SERVICE); 
	//	lock.disableKeyguard();
		// Here it will create the new remote web driver session using below desire capabilities object
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("success");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		logger.log(LogStatus.PASS, "App installed successfully");
		System.out.println("App test success");
	}
		@Test(priority=2)
		public void loginUserPass() throws InterruptedException, IOException
		{
			System.out.println("login test started");
			logger=report.startTest("loginUserPass");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("net.one97.paytm:id/profile_login")).click();
			driver.findElement(By.id("net.one97.paytm:id/edit_username")).sendKeys("7893430515");
			driver.findElement(By.id("net.one97.paytm:id/edit_password")).sendKeys("Q@test1234");
			driver.findElement(By.id("net.one97.paytm:id/lyt_sign_in_button")).click();
			Assert.assertTrue(driver.findElement(By.id("net.one97.paytm:id/name")).getText().equalsIgnoreCase("uddish kappindra"));
		//	TakesScreenshot ts=(TakesScreenshot)driver;
			source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			destination="F:\\Practise\\Practise\\Screenshots\\"+"Login Successful"+".png";
			FileUtils.copyFile(source, new File(destination));
			logger.log(LogStatus.PASS, "User login successs");
			
			
		}
	/*@Test(dependsOnMethods={"loginUserPass"})
	public void userloginFailed()
	{
		logger=report.startTest("userloginFailed");
		Assert.assertTrue(false);
	}*/
	@AfterMethod
	public void loginFailed(ITestResult result) throws WebDriverException, IOException
	{
		System.out.println(result.getStatus());
		/* if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(LogStatus.PASS, "Signin Failed",logger.addScreenCapture(destination));
		}
		else */
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
		logger.log(LogStatus.FAIL, result.getThrowable());
		source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		destination="F:\\Practise\\Practise\\Screenshots\\"+"Login Successful"+".png";
		FileUtils.copyFile(source, new File(destination));
		logger.log(LogStatus.FAIL, "Signin Failed",logger.addScreenCapture(destination));
		}
			report.endTest(logger);
			
	}
	@AfterTest
	public void endReport()
	{
		report.flush();
	}

}
