package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	// Create an account section
	public class NewAccount {
		private By emailAddress = By.id("email_create");
		private By createAnAccountButton = By.id("SubmitCreate");
		
		public void enterEmailAddress(String email) {
			WebElement emailAddressElement = driver.findElement(emailAddress);
			
			if (emailAddressElement.isDisplayed()) {
				emailAddressElement.sendKeys(email);	
			}
		}
		
		public CreateAccountPage clickCreateAnAccountButton() {
			WebElement createAnAccountButtonElement = driver.findElement(createAnAccountButton);
			
			if (createAnAccountButtonElement.isDisplayed() && createAnAccountButtonElement.isEnabled()) {
				createAnAccountButtonElement.click();
			}
			return new CreateAccountPage(driver);
		}
		
	}
	
	// Already registered section
	public class ExistingAccount {
		private By emailAddress = By.id("email");;
		private By password = By.id("passwd");;
		private By forgotYourPassword = By.linkText("Forgot your password?");
		private By signInButton = By.id("SubmitLogin");
		
		/*
		 * Services specific to existing account i.e. login can be specified here 
		 * via methods
		 */
		
		
	}

}
