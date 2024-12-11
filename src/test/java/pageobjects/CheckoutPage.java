package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
	
	@FindBy(css="#first-name")
	private WebElement fnameField;
	
	@FindBy(css="#last-name")
	private WebElement lnameField;
	
	@FindBy(css="#postal-code")
	private WebElement zipcodeField;
	

	@FindBy(css="#cancel")
	private WebElement cancelBtn;
	

	@FindBy(css="#continue")
	private WebElement continueBtn;
	

	@FindBy(css="#finish")
	private WebElement finishBtn;

	@FindBy(css="#back-to-products")
	private WebElement backBtn;

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void stepOne(String fname,String lname,String zipcode) {
		fillText(this.fnameField,fname);
		fillText(this.lnameField,lname);
		fillText(this.zipcodeField,zipcode);
	}
	

	
	public void cancel() {
		click(this.cancelBtn);
	}
	
	public void next() {
		click(this.continueBtn);
	}
	
	public void finish() {
		click(this.finishBtn);
	}
	public void backToHome() {
		click(this.backBtn);
	}
	
}
