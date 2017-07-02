package com.practise;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Mobiwiki {
	//WebDriver driver;
	public DesiredCapabilities cap;
	public AppiumServiceBuilder service;
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	//WebDriver driver;
	
	@Parameters({ "deviceName_","UDID_","platformVersion_", "URL_" })
	@BeforeTest
	public void startServer(String deviceName_,String UDID_,String platformVersion_,String URL_) throws MalformedURLException
	{
		service=new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js"))
				.withIPAddress("127.0.0.1").usingPort(4723)
				.withLogFile(new File("F:\\Practise\\Logfiles\\logs.txt"));
		File appDir = new File("F:\\Practise\\Practise\\apkfiles\\");
		File app = new File(appDir, "Recharge Payments Wallet_v8.4_apkpure.com.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(deviceName_, UDID_);
		capabilities.setCapability(CapabilityType.VERSION,platformVersion_);
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		capabilities.setCapability("app", app.getAbsolutePath()); //app.getAbsolutePath()
		capabilities.setCapability("noReset","true");
		//"--full-reset", false);  
		// Here we mention the app's package name, to find the package name we have to convert .apk file into java class files
		capabilities.setCapability("app-package","com.mobikwik_new");
		//Here we mention the activity name, which is invoked initially as app's first page.
		capabilities.setCapability("app-activity","com.mobikwik_new.MobikwikMain");
		//KeyguardManager keyguardManager = (KeyguardManager)getSystemService(); 
	//	KeyguardLock lock = keyguardManager.newKeyguardLock(KEYGUARD_SERVICE); 
	//	lock.disableKeyguard();
		// Here it will create the new remote web driver session using below desire capabilities object
		driver = new AndroidDriver(service, capabilities);
		System.out.println("success");
		
	}
	@Test(priority=1)
	public void startingAppiumServer() throws InterruptedException, MalformedURLException
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		}
		
		@Test(priority=2)
		public void selectuser() throws InterruptedException
		{
			System.out.println("fail");
			Thread.sleep(10000);
			Dimension	size=driver.manage().window().getSize();
			System.out.println(size);
			  int startx = (int) (size.width * 0.70);
			  System.out.println(startx);
			  int endx = (int) (size.width * 0.30);
			  System.out.println(endx);
			  int starty = size.height / 2;
			  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
			 
			  int i;
			  do
			  {
				  //int count=driver.findElements(By.xpath("//android.widget.FrameLayout/index")).size();
				  int count=driver.findElements(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'card')]")).size();
				  System.out.println("Count is....."+count);
				  
				  for(i=0;i<count;i++)
					  //Swipe from Right to Left.
					  {
					  driver.findElements(By.xpath("//android.widget.FrameLayout[@index='"+i+"']"));
					  
					  
					  //driver.swipe(startx, starty, endx, starty, 300);
					  Thread.sleep(1000);
					  }
				  System.out.println("i value -------------"+i);
				  System.out.println(driver.findElements(By.xpath("//android.widget.FrameLayout[@index='"+(i+1)+"']")));
			  }
			  while(driver.findElements(By.xpath("//android.widget.FrameLayout[@index='"+i+"']"))!=null);
			  {
				//Swipe from Right to Left.
				  {
					  System.out.println(driver.findElements(By.id("com.mobikwik_new:id/card")).size());
				  driver.swipe(startx, starty, endx, starty, 300);
				 // Thread.sleep(1000);
				  }
				  
			  }
			  /*for(int i=0;i<7;i++)
			  //Swipe from Right to Left.
			  {
			  driver.swipe(startx, starty, endx, starty, 300);
			  Thread.sleep(1000);
			  }
			  List<WebElement> lst=driver.findElements(By.id("com.mobikwik_new:id/card"));
			  System.out.println(lst.size());
			  for(int i=0;i<7;i++)
			  {
			  //Swipe from Left to Right.
			 driver.swipe(endx, starty, startx, starty, 300);
			 Thread.sleep(1000);
			  }*/
			//driver.s
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			HashMap<String, Double> swipeObject = new HashMap<String, Double>();
			swipeObject.put("1", 0.01);
			//swipeObject.put(“startY”, 0.5);
			//swipeObject.put(“endX”, 0.9);
			//swipeObject.put(“endY”, 0.6);
			//swipeObject.put(“duration”, 3.0);
			js.executeScript("mobile : swipe",swipeObject);
			js.executeScript("mobile : swipe",swipeObject);
			js.executeScript("mobile : swipe",swipeObject);
			js.executeScript("mobile : swipe",swipeObject);*/
			//WebElement e1=driver.findElement(By.id("com.mobikwik_new:id/balance_parent"));
			/*JavascriptExecutor js = (JavascriptExecutor) driver; 
			HashMap<String, Double> swipeObject = new HashMap<String, Double>(); 
			swipeObject.put("954", 0.01); 
			swipeObject.put("1020", 0.5); 
			swipeObject.put("1080", 0.5); 
			swipeObject.put("1120", 0.6); 
			swipeObject.put("duration", 2.5); 
			HashMap[] params = { swipeObject }; 
			js.executeScript("mobile: swipe", params);*/
			/*driver.findElement(By.id("com.mobikwik_new:id/balance_parent")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("com.mobikwik_new:id/edit_text_mket")).clear();
			driver.findElement(By.id("com.mobikwik_new:id/edit_text_mket")).sendKeys("9177593037");
			driver.findElement(By.id("com.mobikwik_new:id/btnLogin")).click();
			driver.findElement(By.id("com.mobikwik_new:id/otp_field")).click();
			driver.findElement(By.id("com.mobikwik_new:id/home_page_wallet_nav")).click();
			driver.findElement(By.id("com.mobikwik_new:id/mkab_icon_5")).click();
			driver.findElement(By.className("android.widget.ListView")).click();*/
			}
	
		
	
	@AfterTest
	public void stopingAppiumServer()
	{
		//driver.stop();
	}


}
