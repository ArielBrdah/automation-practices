package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart(String productName) {
		
		List<WebElement> products = driver.findElements(By.cssSelector(".inventory_item"));
		for(WebElement product : products ) {
			String p = product.findElement(By.cssSelector(".inventory_item_name")).getText();
			if(productName.equalsIgnoreCase(p)) {				
				click(product.findElement(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")));
				break;
			}
		}
	}
	
	public void openCart() {
		click(driver.findElement(By.cssSelector(".shopping_cart_link")));
	}
	
	public void chooseProduct(String name) {
		List<WebElement> list = this.driver.findElements(By.cssSelector(".inventory_item_name"));
		
		for(WebElement el : list) {			
			if(el.getText().equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}
}
