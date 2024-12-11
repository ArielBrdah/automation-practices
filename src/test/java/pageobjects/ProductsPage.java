package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	
	@FindBy(css="#react-burger-menu-btn")
	private WebElement hamburgerIcon;
	
	@FindBy(css="#logout_sidebar_link")
	private WebElement logoutNav;
	
	@FindBy(css=".shopping_cart_link")
	private WebElement cart;
	
	@FindBy(css=".inventory_item")
	private List<WebElement> products;

	@FindBy(css=".inventory_item_name")
	private List<WebElement> prods;


	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart(String productName) {
		
		for(WebElement product : products ) {
			String p = product.findElement(By.cssSelector(".inventory_item_name")).getText();
			if(productName.equalsIgnoreCase(p)) {				
				click(product.findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")));
				break;
			}
		}
	}
	
	public void openCart() {
		click(this.cart);
	}
	
	public void chooseProduct(String name) {
		
		for(WebElement product : this.prods) {			
			if(product.getText().equalsIgnoreCase(name)) {
				click(product);
				break;
			}
		}
	}

	public void logout() {
		click(hamburgerIcon);
		sleep(500);
		click(logoutNav);
	}

}
