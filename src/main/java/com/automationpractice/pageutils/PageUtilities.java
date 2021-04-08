package com.automationpractice.pageutils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	/**
	 * 
	 * @param driver
	 * @param elementLocator
	 */	
	public static void scrollToElement(WebDriver driver, By elementLocator) {
		WebElement element = driver.findElement(elementLocator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementLocator
	 */	
	public static void waitForVisibility(WebDriver driver, By elementLocator){
        new WebDriverWait(driver, 20)
             .until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	}

}
