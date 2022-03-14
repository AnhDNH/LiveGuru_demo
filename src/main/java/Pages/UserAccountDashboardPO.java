package Pages;

import PageUIs.UserAccountPageUI;
import common.WebKeywords.WebKeywords;
import org.openqa.selenium.WebDriver;


public class UserAccountDashboardPO extends WebKeywords {
WebDriver driver;
	
	public UserAccountDashboardPO(WebDriver driver) {
		this.driver = driver;
	}

	public Object getAccountDashboardWelcomeMessage() {
		return getElementText(driver, UserAccountPageUI.MY_DASHBOARD_WELCOME_MESSAGE);
	}
}
