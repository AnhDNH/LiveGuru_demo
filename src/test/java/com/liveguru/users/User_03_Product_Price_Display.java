package com.liveguru.users;

import Pages.PageGeneratorManager;
import Pages.UserHomePO;
import Pages.UserMobileProductPO;
import Pages.UserProductDetailPO;
import common.WebKeywords.WebKeywords;
import common.configs.GlobalConstants;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class User_03_Product_Price_Display extends WebKeywords {
	WebDriver driver;

	@Parameters({ "browser"})
	@BeforeClass
	public void beforeClass(String browser) {
		driver = getBrowserDriver(browser, GlobalConstants.LIVEGURU_USER_URL);

		homePage = PageGeneratorManager.getHomePage(driver);

	}

	@Test
	public void TC_01_Verify_Product_Price_Display() {
		log.info("Price Display - Step 01: Click on 'Mobile' menu");
		homePage.clickOnMobileMenu();
		mobileProductPage = PageGeneratorManager.getUserMobileProductPage(driver);

		log.info("Price Display - Step 02: Get price of 'Sony Xperia' mobile");
		String XperiaPriceProductPage = (String) mobileProductPage.getSonyXperiaPriceOnProductPage("Sony Xperia");
		
		log.info("Price Display - Step 03: Click on 'Sony Xperia' detail");
		mobileProductPage.clickOnSonyXperiaProductName("Sony Xperia");
		productDetailPage = PageGeneratorManager.getUserProductDetailPage(driver);

		log.info("Price Display - Step 04: Get price of 'Sony Xperia' on Detail page");
		productDetailPage.getSonyXperiaPriceOnDetailPage();

		log.info("Price Display - Step 05: Verify Price of 'Sony Xperia' in Product page & Detail page are equal");
		verifyEquals(XperiaPriceProductPage, productDetailPage.getSonyXperiaPriceOnDetailPage());

	}

	UserHomePO homePage;
	UserMobileProductPO mobileProductPage;
	UserProductDetailPO productDetailPage;

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
