package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage extends BasePage {
	
	private By accountCreationForm = By.id("account-creation_form");

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	private void scrollToElement(By elementLocator) {
		WebElement element = driver.findElement(elementLocator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	private void waitForVisibility(By elementLocator){
        new WebDriverWait(driver, 20)
             .until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	}


	// Personal Information section
	public class PersonalInformation {
		private By male = By.id("id_gender1");
		private By female = By.id("id_gender2");
		private By firstName = By.id("customer_firstname");
		private By lastName = By.id("customer_lastname");
		private By email = By.id("email");
		private By password = By.id("passwd");
		private By days = By.id("days");
		private By months = By.id("months");
		private By years = By.id("years");

		public String getPrepopulatedEmailAddress() {			
			waitForVisibility(accountCreationForm);
			
			return driver.findElement(email).getAttribute("value");
		}

		private void selectGeneder(String genderType) {
			WebElement genderElement;
			if (genderType == "male") {
				genderElement = driver.findElement(male);
			} 
			else {
				genderElement = driver.findElement(female);
			}
			genderElement.click();
		}

		private void enterFirstName(String fName) {
			WebElement firstNameElement = driver.findElement(firstName);

			if (firstNameElement.isDisplayed()) {
				firstNameElement.sendKeys(fName);
			}
		}

		private void enterLastName(String lName) {
			scrollToElement(lastName);
			WebElement lastNameElement = driver.findElement(lastName);

			if (lastNameElement.isDisplayed()) {
				lastNameElement.sendKeys(lName);
			}
		}

		private void enterPassword(String pwd) {
			WebElement passwordElement = driver.findElement(password);

			if (passwordElement.isDisplayed()) {
				passwordElement.sendKeys(pwd);
			}
		}

		private void selectDay(String birth_day) {
			Select day = new Select(driver.findElement(days));

			day.selectByValue(birth_day);
		}

		private void selectMonth(String birth_month) {
			Select month = new Select(driver.findElement(months));

			month.selectByValue(birth_month);
		}

		private void selectYear(String birth_year) {
			Select year = new Select(driver.findElement(years));

			year.selectByValue(birth_year);
		}

		public void enterPersonalInformation(String genderType, String firstName, String lastName, String password,
				String birthDay, String birthMonth, String birthYear) {

			selectGeneder(genderType);

			enterFirstName(firstName);

			enterLastName(lastName);

			enterPassword(password);
			
			selectDay(birthDay);
			
			selectMonth(birthMonth);
			
			selectYear(birthYear);
		}

	}

	// Address section
	public class Address {
		private By firstName = By.id("firstname");
		private By lastName = By.id("lastname");
		private By company = By.id("company");
		private By address = By.id("address1");
		private By addressLine2 = By.id("address2");
		private By city = By.id("city");
		private By state = By.id("id_state");
		private By postalCode = By.id("postcode");
		private By country = By.id("id_country");
		private By additionalInfo = By.id("other");
		private By homePhone = By.id("phone");
		private By mobilePhone = By.id("phone_mobile");
		private By aliasAddress = By.id("alias");
		private By registerButton = By.id("submitAccount");
		
		private void enterFirstName(String fName) {
			WebElement firstNameElement = driver.findElement(firstName);

			if (firstNameElement.isDisplayed()) {
				firstNameElement.sendKeys(fName);
			}
		}

		private void enterLastName(String lName) {
			scrollToElement(lastName);
			WebElement lastNameElement = driver.findElement(lastName);

			if (lastNameElement.isDisplayed()) {
				lastNameElement.sendKeys(lName);
			}
		}
		
		private void enterAddress(String addr) {
			WebElement addressElement = driver.findElement(address);

			if (addressElement.isDisplayed()) {
				addressElement.sendKeys(addr);
			}
		}
		
		private void enterCity(String cty) {
			WebElement cityElement = driver.findElement(city);

			if (cityElement.isDisplayed()) {
				cityElement.sendKeys(cty);
			}
		}
		
		private void selectState(String st) {
			scrollToElement(state);
			
			Select value = new Select(driver.findElement(state));

			value.selectByVisibleText(st);
		}
		
		/*
		private void selectCountry(String cntry) {			
			Select cntr = new Select(driver.findElement(country));

			cntr.selectByVisibleText(cntry);
			}
		}
		*/
		
		private void enterMobileNumber(int mobileNo) {
			WebElement mobilePhoneElement = driver.findElement(mobilePhone);
			
			if (mobilePhoneElement.isDisplayed()) {
				mobilePhoneElement.sendKeys(Integer.toString(mobileNo));
			}
			
		}
		
		private void enterPostCode(int postCode) {
			waitForVisibility(postalCode);
			
			WebElement postalCodeElement = driver.findElement(postalCode);
			
			if (postalCodeElement.isDisplayed()) {
				postalCodeElement.sendKeys(Integer.toString(postCode));
			}
			
		}
		
		private void enterAliasAddress(String aliasAddr) {
			waitForVisibility(aliasAddress);
			
			WebElement aliasAddressElement = driver.findElement(aliasAddress);
			
			if (aliasAddressElement.isDisplayed()) {
				aliasAddressElement.sendKeys(aliasAddr);
			}
			
		}
		public void enterAddressDetails(String firstName, String lastName, String address,
				String city, String state, int postalCode, 
				int mobileNumber, String aliasAddress) {
			
			enterFirstName(firstName);
			
			enterLastName(lastName);
			
			enterAddress(address);
			
			enterCity(city);
			
			selectState(state);
			
			enterPostCode(postalCode);
			
			enterMobileNumber(mobileNumber);
			
			enterAliasAddress(aliasAddress);
		}
		
		public UserAccountPage clickRegisterButton() {
			WebElement registerButtonElement = driver.findElement(registerButton);
			
			if (registerButtonElement.isDisplayed() && registerButtonElement.isEnabled()) {
				registerButtonElement.click();
			}
			
			return new UserAccountPage(driver);
			
		}
	}

}
