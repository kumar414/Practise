package com.practise;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mynthraapp
{

	WebDriver driver= null;

	@BeforeClass
	public void Mythraapptesting() throws Exception
	{
		
		
		File appDir = new File("F:\\Practise\\Practise\\apkfiles\\");
		File app = new File(appDir, "net.one97.paytm-5.8.1@APK4Fun.com.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//capabilities.setCapability("device","AppiumDevice");
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		
	//	capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("deviceName", "484ac266");
		
		capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		capabilities.setCapability("app", app.getAbsolutePath()); //app.getAbsolutePath()
		//capabilities.setCapability("noReset","true");
		// Here we mention the app's package name, to find the package name we have to convert .apk file into java class files
		capabilities.setCapability("app-package","net.one97.paytm");
		
		//Here we mention the activity name, which is invoked initially as app's first page.
		capabilities.setCapability("app-activity","net.one97.paytm.AJRJarvisSplash");
		
		// Here it will create the new remote web driver session using below desire capabilities object
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		
		@Test
		public void selectuser() throws InterruptedException
		{
			Thread.sleep(1000);
					driver.findElement(By.className("android.widget.ImageButton")).click();
		}
	}
