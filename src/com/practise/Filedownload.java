package com.practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownload {
	public static void main(String [] args)
	{
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    String baseUrl = "http://demo.guru99.com/selenium/yahoo.html";
    WebDriver driver = new FirefoxDriver();
    driver.get(baseUrl);
    WebElement downloadButton = driver.findElement(By.id("messenger-download"));
    	String sourceLocation = downloadButton.getAttribute("href");
    	String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

try {
Process exec = Runtime.getRuntime().exec(wget_command);
int exitVal = exec.waitFor();
System.out.println("Exit value: " + exitVal);
} catch (IOException | InterruptedException ex) {
System.out.println(ex.toString());
}
driver.close();
}
	

}
