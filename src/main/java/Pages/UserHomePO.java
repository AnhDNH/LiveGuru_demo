package Pages;

import PageUIs.UserHomePageUI;
import common.WebKeywords.WebKeywords;
import org.openqa.selenium.WebDriver;


public class UserHomePO extends WebKeywords {
	WebDriver driver;
	
	public UserHomePO(WebDriver driver) {
		this.driver = driver;
	}

	public Object getSuccessMessage() {
		waitToElementVisible(driver, UserHomePageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, UserHomePageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public void clickOnMobileMenu() {
		waitToElementClickable(driver, UserHomePageUI.MOBILE_MENU_LINK);
		clickOnElement(driver, UserHomePageUI.MOBILE_MENU_LINK);
		
	}

}
