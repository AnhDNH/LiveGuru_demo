package Pages;

import PageUIs.UsersProductDetailPageUI;
import common.WebKeywords.WebKeywords;
import org.openqa.selenium.WebDriver;



public class UserProductDetailPO extends WebKeywords {
	WebDriver driver;
	
	public UserProductDetailPO(WebDriver driver) {
		this.driver = driver;
	}

	public Object getSonyXperiaPriceOnDetailPage() {
		return getElementText(driver, UsersProductDetailPageUI.PRODUCT_PRICE_ON_DETAIL_PAGE);
		
	}


	
}
