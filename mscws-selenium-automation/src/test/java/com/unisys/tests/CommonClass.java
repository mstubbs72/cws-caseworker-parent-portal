package com.unisys.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.unisys.objectrepository.BasicSearchPage;
import com.unisys.objectrepository.HomePage;

public class CommonClass {
 
  public static WebDriver launchApplication(WebDriver driver) throws InterruptedException{
		driver = new FirefoxDriver();
		//driver.get("http://ustr-erl-5411.na.uis.unisys.com:8080/mscws-portal/resources/app/index.html");
		driver.get("http://192.62.156.35:8080/mscws-portal/resources/index.html#/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		return driver;
	}
	
	public static WebDriver NavigateToBasicSearch(WebDriver driver) throws InterruptedException{
		HomePage.StartSearching(driver).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		return driver;
	}
	
	public static WebDriver SearchWithProviderName(WebDriver driver, String providerName) throws InterruptedException{
		BasicSearchPage.ProviderName(driver).sendKeys(providerName);
		Thread.sleep(2000);
		BasicSearchPage.SearchBtn(driver).click();	
		Thread.sleep(3000);
		//html/body/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[1]/h4/b
		//String DisplayedName = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/h4/b")).getText();
		String DisplayedName = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[1]/h4/b")).getText();
		Assert.assertEquals(DisplayedName, "Ahead of the Crowd Academy");		
		if (DisplayedName.contains("Ahead of the Crowd Academy"))
			System.out.println("Provider Name displayed correctly: Displayed Name "+ DisplayedName);
		else
			System.out.println("Incorrect Provider Name displayed. Expected provider Name:  Ahead of the Crowd Academy. Actual Provider Name displayed : "+DisplayedName);
					
		System.out.println(driver.getTitle());
		return driver;
	} 
	
}
