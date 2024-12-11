package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	  protected WebDriver driver;
		
	  @BeforeClass
	  public void beforeClass() {
	      System.setProperty("webdriver.chrome.driver","C:/Users/ASUS/workspace/automation-project-2024/test-app/chromedriver-win64/chromedriver.exe");
	      this.driver = new ChromeDriver();
	      this.driver.manage().window().maximize();
	      this.driver.get("https://saucedemo.com/");
	  }
	  

	  @AfterClass
	  public void afterClass() {
		  //this.driver.close();
	  }
}
