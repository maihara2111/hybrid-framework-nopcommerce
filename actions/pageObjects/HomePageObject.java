package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage{
	private WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageOject openRegisterPage() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		//2
		//return new RegisterPageOject(driver);
		return PageGeneratorManager.getRegisterPage(driver);
	}

	public LoginPageObject openLoginPage() {
		waitForElementClickable(driver, HomePageUI.LOG_IN_LINK);
		clickToElement(driver, HomePageUI.LOG_IN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
	}
	
	public CustomerInfoPageObject openCustomerInfoPage() {
		waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return PageGeneratorManager.getCustomerInfoPage(driver);
	}

	public boolean isMyAccountLinkDisplayed() {
		waitForElementVisible(driver, HomePageUI.MY_ACCOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACCOUNT_LINK);
	}
}
