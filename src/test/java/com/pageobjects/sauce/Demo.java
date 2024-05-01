package com.pageobjects.sauce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{

	WebDriver driver;
	
	
	@Test
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	@Test
	public void product_search()
	{
		
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("samsung");
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
	}

}
