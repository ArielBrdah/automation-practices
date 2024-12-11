package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage{
	
	@FindBy(css=".btn.btn_action.btn_medium.checkout_button")
	WebElement checkoutBtn;

	public YourCartPage(WebDriver driver) {
		super(driver);
	}

	public void checkout() {
		click(this.checkoutBtn);
	}
}
