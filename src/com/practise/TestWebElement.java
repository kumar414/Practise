package com.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestWebElement {
	WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "../geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> wlist=driver.findElements(By.tagName("tr"));
		System.out.println(wlist.size());
		Thread.sleep(10000);
		List<WebElement> wlist1=driver.findElements(By.tagName("th"));
		System.out.println(wlist1.size());
		/*for(int i=0;i<wlist.size();i++)
		{
			for(int j=1;j<=7;j++ )
			{
			if(i==0)
			{
			System.out.println(driver.findElement(By.xpath("//*[@id='content']/table/thead/tr/th["+j+"]")).getText());
			}
			else 
			{
				System.out.println(driver.findElement(By.xpath("//*[@id='content']/table/thead/tr["+i+"]/th["+j+"]")).getText());
			}
			}*/
		}
	@Test
	public void test2()
	{
		System.out.println("driver quit method");
		driver.quit();
	}
	}

//}
