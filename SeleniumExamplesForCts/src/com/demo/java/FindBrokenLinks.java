package com.demo.java;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.firefox.marionette", "E:/LIST OF JARS/Webdriver drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com");
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		List<WebElement> numLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement ele:numLinks)
		{
			getConnections(ele.getAttribute("href"));
		}
		
		
		
		
		
		
	}
	
	private static void getConnections(String surl) throws Exception
	{
		
		URL url=new URL(surl);
		
		HttpURLConnection connection=(HttpURLConnection) (url).openConnection();
		connection.connect();
		
		if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(surl);
		}
		
	}

}
