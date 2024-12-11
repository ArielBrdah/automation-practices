package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
  }



}
