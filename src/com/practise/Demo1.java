package com.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void test1() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "/../geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://istqbexamcertification.com/wp-content/uploads/2014/09/istqbExamCertification.com-ISTQB-Dumps-and-Mock-Tests-for-Foundation-Level-Paper-1.pdf");
		PDDocument doc = PDDocument.load(new URL(driver.getCurrentUrl()));
		 String x1= new PDFTextStripper().getText(doc);
	        System.out.println(x1);
		//File fs=new File("/tesst.txt");
		//FileReader fin=new FileReader(fs);
		//FileReader fr=new FileReader("d:\\seleniumtraining\\data.txt");
		//BufferedReader br=new BufferedReader(fin);
		//String line=br.readLine();
		//System.out.println(line);
		//driver.get("http://toolsqa.com/automation-practice-table/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//System.out.println("../geckodriver.exe");
		/*LinkedList lst1=new LinkedList();
		lst1.add("1");
		lst1.add("2");
		lst1.add("3");
		System.out.println(lst1.size());
		System.out.println(lst1); 
		for(String st1 : lst1)
		{
			System.out.println(st1);
		}
		System.out.println();
		for(int i=0;i<lst1.size();i++)
		{
			System.out.println(lst1.get(i)); 
		}
		ListIterator mtite=lst1.listIterator();
		while(mtite.hasNext())
		{
			String str=(String) mtite.next();
			System.out.println(str);
			if(str.equals("1"))
			{
				mtite.remove();
			}
			else if(str.equals("2"))
			{
				mtite.add("4");
			}
			else if(str.equals("3"))
			{
				mtite.set("5");
			}
		}
		System.out.println(lst1);
		*/

	/*//	WebDriver driver=new FirefoxDriver();
	//	driver.get("http://toolsqa.com/automation-practice-table/");
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	List<WebElement> wlist=driver.findElements(By.tagName("tr"));
		Thread.sleep(10000);
		//driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[2]/div[1]/ul/li[3]/a/h2")).click();
		//String par_win=driver.getTitle();
		System.out.println(par_win);
	//	Set<String> s1 = driver.getWindowHandles(); 
	    String [] s1 = {"abc","cdf"};
		//System.out.println(s1.size());
		//String[]cw=new String[s1.size()];
		Iterator<String> i1=s1.iterator();
		int i=0;
		while(i1.hasNext())
		{
			cw[i]=i1.next();
			i++;
		}
		
		for(int i=0;i<s1.size();i++ )
		{
			cw[i]=(String)s1.toArray()[i];
					}
		System.out.println(driver.switchTo().window(cw[0]).getTitle());
		System.out.println(driver.switchTo().window(cw[1]).getTitle());
		System.out.println(driver.switchTo().window(cw[2]).getTitle());
		
		
		String window1=(String)s1.toArray()[0];
		String window2=(String)s1.toArray()[1];
		//String window3=(String)s1.toArray()[2];
		driver.switchTo().window(window2);
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=r0A4WbjOCe_y8AeAsICgDw&gws_rd=ssl");
		driver.findElement(By.id("lst-ib")).sendKeys("seleniumtutorials");
		Thread.sleep(1000);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int i=0;
		for(WebElement element:links)
		{
			System.out.println(element.getTagName());
			System.out.println(element.getText());
		}
		*/
		
		
	}
	
	

}
