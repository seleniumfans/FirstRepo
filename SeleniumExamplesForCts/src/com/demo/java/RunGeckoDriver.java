/**
 * 
 */
package com.demo.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author windows
 *
 */
public class RunGeckoDriver {
	
	
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","E:/LIST OF JARS/Webdriver drivers/geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","E:/LIST OF JARS/Webdriver drivers/geckodriver.exe");
		 
		
        
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://learn-automation.com");
		System.out.println("Driver Title is :"+driver.getCurrentUrl());
	}

}
