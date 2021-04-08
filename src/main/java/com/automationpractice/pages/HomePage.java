package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	//private By signInButton = By.xpath("//a[contains(text(), 'Sign in')]");
	private By signInButton = By.linkText("Sign in");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage clickSignInButton() {
		WebElement signInButtonElement = driver.findElement(signInButton);
		if (signInButtonElement.isDisplayed() && signInButtonElement.isEnabled()) {
			signInButtonElement.click();
		}
		return new LoginPage(driver);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	

}
