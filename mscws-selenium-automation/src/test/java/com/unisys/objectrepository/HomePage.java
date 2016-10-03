package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage {
	public static WebElement StartSearching(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.linkText("Start Searching"));
		 return element;
	}
}
