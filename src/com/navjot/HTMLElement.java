package com.navjot;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;
public class HTMLElement {
	WebDriver driver;
	InputStream inputStream;

	// Setup the driver
	@Before
	public void setup(){
		 System.setProperty("webdriver.firefox.marionette","C:\\Users\\chimawarade\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
	     driver.get("file://C://Navjot work//New folder//example.html");
	 
	}
	@Test
	public void get3rdn5thItem(){
	    List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'itemContent')]/span[contains(@ng-bind,food.name)]"));
		System.out.println(list.get(4).getText());
		String fourElement = list.get(4).getText();
		System.out.println(list.get(8).getText());
		String eightElement = list.get(8).getText();
		Assert.assertEquals(fourElement, "Applesauce, unsweetened");
	    
	}
	@Test
	public void storeElementsMap(){
		HashMap<String, String> map = new HashMap<>();
		List<WebElement> allitems = driver.findElements(By.xpath("//div[contains(@class,'itemContent')]/span"));
		for(int i =0; i<allitems.size()-1; i=i+2)
		{
			map.put(allitems.get(i).getText(), allitems.get(i+1).getText());
		}
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println(allitems.toString());
	}
	
}
