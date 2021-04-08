package com.automationpractice.tests;

import org.testng.annotations.Test;
import com.automationpractice.pages.HomePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageTest extends BaseTest {
	protected WebDriver driver = null;
	private HomePage homePage;
	
  @Test
  public void validateHomePage() {	  
	  homePage  = new HomePage(driver);
	  
	  System.out.println(homePage.getPageTitle());
	 	  
	  Assert.assertEquals(homePage.getPageTitle(), "My Store");
	  
	  //extent = Utilities.getReporter();
	  
  }
  
  @BeforeClass
  public void setup() {
	  driver = getDriver();
  }
  
  @AfterClass
  public void afterClass() {
	  
  }
}
