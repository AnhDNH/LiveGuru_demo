package Pages;

import PageUIs.UsersLoginPageUI;
import common.WebKeywords.WebKeywords;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class UserLoginPO extends WebKeywords {
    WebDriver driver;

    public UserLoginPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click Login button")
    public void clickLoginButton() {
        waitToElementClickable(driver, UsersLoginPageUI.LOGIN_BUTTON);
        clickOnElement(driver, UsersLoginPageUI.LOGIN_BUTTON);
    }
	@Step("Get required error message at Email field")
    public Object getRequiredErrorMessageAtEmailField(String fieldValue) {
        return getElementText(driver, UsersLoginPageUI.DYNAMIC_REQUIRED_ERROR_MESSAGE, fieldValue);
    }
	@Step("Get required error message at Password field")
    public Object getRequiredErrorMessageAtPasswordField(String fieldValue) {
        return getElementText(driver, UsersLoginPageUI.DYNAMIC_REQUIRED_ERROR_MESSAGE, fieldValue);
    }
	@Step("Input email textbox")
    public void inputEmailTextbox(String userEmail) {
        waitToElementVisible(driver, UsersLoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UsersLoginPageUI.EMAIL_TEXTBOX, userEmail);

    }
	@Step("Input password textbox")
    public void inputPasswordTextbox(String userPassword) {
        waitToElementVisible(driver, UsersLoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UsersLoginPageUI.PASSWORD_TEXTBOX, userPassword);
    }
	@Step("Get validation error message at password field")
    public Object getValidationErrorMessageAtPasswordField(String fieldValue) {
        return getElementText(driver, UsersLoginPageUI.DYNAMIC_VALIDATION_ERROR_MESSAGE, fieldValue);
    }
	@Step("Get validation error message at email field")
    public Object getValidationErrorMessageAtEmailField(String fieldValue) {
        return getElementText(driver, UsersLoginPageUI.DYNAMIC_VALIDATION_ERROR_MESSAGE, fieldValue);
    }
	@Step("Get error message")
    public Object getErrorMessage() {
        return getElementText(driver, UsersLoginPageUI.LOGIN_PAGE_ERROR_MESSAGE_UNDER_PAGE_TITLE);
    }
}
