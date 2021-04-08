package com.automationpractice.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;

public class LoginTest extends BaseTest {
	protected WebDriver driver = null;
	private HomePage homePage;
	private LoginPage loginPage;
	
  @Test
  public void verifyUserLogin() {
  }
  
  @BeforeClass
  public void setup() {
	  driver = getDriver();
  }
}
