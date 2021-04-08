package com.automationpractice.tests;

import org.testng.annotations.Test;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import Utils.Utilities;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CreateAccountTest extends BaseTest {
	protected WebDriver driver = null;
	private HomePage homePage;
	private LoginPage loginPage;
	private LoginPage.NewAccount newAccount;
	private CreateAccountPage createAccountPage;
	private CreateAccountPage.PersonalInformation personalInformation;
	private CreateAccountPage.Address addressDetails;
	
  @Test
  public void verifyAccountCreation() throws InterruptedException {	  
	  homePage  = new HomePage(driver);
	  
	  loginPage = homePage.clickSignInButton();
	  
	  Assert.assertEquals(homePage.getPageTitle(), "Login - My Store");
	  
	  newAccount = loginPage.new NewAccount();
	  
	  String emailId = Utilities.generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 10);
	  
	  String emailAddress = emailId + "@example.com";
	  	  
	  newAccount.enterEmailAddress(emailAddress);
	  
	  createAccountPage = newAccount.clickCreateAnAccountButton();
	  
	  
	  personalInformation = createAccountPage.new PersonalInformation();
	  
	  Assert.assertEquals(personalInformation.getPrepopulatedEmailAddress(), emailAddress);
	  
	  personalInformation.enterPersonalInformation("Male", "Automation", "Practice", 
			  "secret", "10", "1", "2003");
	  
	  addressDetails = createAccountPage.new Address();
	  
	  addressDetails.enterAddressDetails("Automation", "Practice", "George St",
			  "New York", "Arizona", 22222, 123456789, "Louis St");
	  
	  addressDetails.clickRegisterButton();
	  
	  System.out.println("Pausing execution just for demo purpose."
	  		+ "When My account page is modeled, synchronization can be handled ");
	  
	  Thread.sleep(50000);
  }
  
  @BeforeClass
  public void setup() {
	  driver = getDriver();
  }
  
  @AfterClass
  public void afterClass() {
	  
  }

}
