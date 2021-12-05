package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;
import pageObjects.RegisterPageOject;

public class Level_03_Page_Object_01_Register extends BasePage {
	private WebDriver driver;
	private String projectpath = System.getProperty("user.dir");
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage;
	private RegisterPageOject registerPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectpath + "//browserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		// Driver có ID rồi

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Open URL >> qua homepage
		driver.get("https://demo.nopcommerce.com/");
		homePage = new HomePageObject(driver);

		// Call function
		emailAddress = "maihara" + generateEmail();
		firstName = "Mai";
		lastName = "Hara";
		password = "111111";

	}

	@Test
	public void Register_01_Empty_Data() {
		System.out.println("Register_01 - Step 01: Click on Register link");
		homePage.openRegisterPage();

		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_01 - Step 02: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_01 - Step 03: Verify Error Message Display");
		Assert.assertEquals(registerPage.getErrorMessageAtFirstNameTextbox(), "First name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtLastNameTextbox(), "Last name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Email is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "Password is required.");
	}

	@Test
	public void Register_02_Invalid_Email() {
		System.out.println("Register_02 - Step 01: Click on Register link");
		homePage.openRegisterPage();

		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_02 - Step 02: Input to required fields ");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox("Mai@#@$@$@");
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register_02 - Step 03: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_02 - Step 04: Verify Error Message Display");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Wrong email");
	}

	@Test
	public void Register_03_Register_Success() {
		System.out.println("Register_03 - Step 01: Click on Register link");
		homePage.openRegisterPage();

		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_03 - Step 02: Input to required fields ");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register_03 - Step 03: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_03 - Step 04: Verify Register Success Message");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		System.out.println("Register_03 - Step 05: Click on Log out link");
		registerPage.clickToLogOutLink();
		homePage = new HomePageObject(driver);
	}

	@Test
	public void Register_04_Existing_Email() {
		System.out.println("Register_04 - Step 01: Click on Register link");
		homePage.openRegisterPage();
		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_04 - Step 02: Input to required fields ");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Register_04 - Step 03: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_04 - Step 04: Verify Error existing email Message Display");
		Assert.assertEquals(registerPage.getErrorExistingEmailMessage(), "The specified email already exists");
	}

	@Test
	public void Register_05_Password_Less_Than_6_Chars() {
		System.out.println("Register_05 - Step 01: Click on Register link");
		homePage.openRegisterPage();
		
		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_05 - Step 02: Input to required fields ");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox("mai55555@mail.net");
		registerPage.inputToPasswordTextbox("111");
		registerPage.inputToConfirmPasswordTextbox("111");

		System.out.println("Register_05 - Step 03: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_05 - Step 04: Verify Error Message Display");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password must meet the following rules:\nmust have at least 6 characters");
	}

	@Test
	public void Register_06_Invalid_Confirm_Password() {
		System.out.println("Register_06 - Step 01: Click on Register link");
		homePage.openRegisterPage();
		// Click register link qua Register page
		registerPage = new RegisterPageOject(driver);

		System.out.println("Register_06 - Step 02: Input to required fields ");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox("mai55555@mail.net");
		registerPage.inputToPasswordTextbox("111111");
		registerPage.inputToConfirmPasswordTextbox("111222");

		System.out.println("Register_06 - Step 03: Click on Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_06 - Step 04: Verify Error Message Display");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "The password and confirmation password do not match.");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public String generateEmail() {
		Random rand = new Random();
		return rand.nextInt(9999) + "@mail.net";
	}

}
