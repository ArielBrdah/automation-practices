package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
	
	@FindBy(css=".btn.btn_primary.btn_small.btn_inventory")
	private WebElement addBtn;
	
	@FindBy(css=".btn.btn_secondary.back.btn_large.inventory_details_back_button")
	private WebElement backBtn;
	
	@FindBy(css=".shopping_cart_link")
	private WebElement openCartBtn;
	
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart() {
		click(this.addBtn);
	}
	
	public void backToProducts() {
		click(this.backBtn);
	}
	
	public void openCart() {
		click(this.openCartBtn);
	}
}
