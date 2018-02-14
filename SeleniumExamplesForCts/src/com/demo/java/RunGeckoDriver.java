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
		
		 
		
        
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com");
		System.out.println("Driver Title is :"+driver.getCurrentUrl());
	}

}
