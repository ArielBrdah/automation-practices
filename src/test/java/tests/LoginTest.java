package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;
import tests.BaseTest;

public class LoginTest extends BaseTest {

  @Test
  public void tc01_loginSucceed() {
	  LoginPage lp = new LoginPage(driver);
	  lp.login("standard_user", "secret_sauce");
	  ProductsPage psp = new ProductsPage(driver);
	  psp.logout();
  }
  
  @Test
  public void tc02_loginFailed() {
	  LoginPage lp = new LoginPage(driver);
	  lp.login("unknown", "12kek03");
	  String expected = "Epic sadface: Username and password do not match any user in this service";
	  String actual = lp.getErrorMsg();
	  Assert.assertEquals(expected, actual);
	  lp.clear();
  }

  @Test
  public void tc03_loginFailed_empty() {
	  LoginPage lp = new LoginPage(driver);
	  lp.login("", "");
	  String expected = "Epic sadface: Username is required";
	  String actual = lp.getErrorMsg();
	  Assert.assertEquals(expected, actual);
  }


}
