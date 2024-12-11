package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(css="#user-name")
	WebElement usernameInputBox;
	
	@FindBy(css="#password")
	WebElement passwordInputBox;
	
	@FindBy(css="[type=submit]")
	WebElement submitBtn;

	public LoginPage(WebDriver driver){
		super(driver);
	}

	public void login(String userStr, String passStr) {
		fillText(this.usernameInputBox, userStr);
		fillText(this.passwordInputBox, passStr);
		click(this.submitBtn);
	}
}
