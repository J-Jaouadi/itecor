package com.sample.testProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AppTest {

	private WebDriver driver;	
	
  @Test
  public void f() {
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);	
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println( "Tests!" );
	  driver  = new FirefoxDriver();
	  driver.navigate().to("http://itecor.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
