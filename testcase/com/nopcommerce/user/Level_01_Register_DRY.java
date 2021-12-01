package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Level_01_Register_DRY {
	WebDriver driver;
	String projectpath = System.getProperty("user.dir");
	String emailAddress;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectpath + "//browserDrivers/geckodriver.exe");
		driver = new FirefoxDriver();
		emailAddress = "maihara" + generateEmail();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void TC_01_Register_Empty_Data() {
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("button#register-button")).click();

		Assert.assertEquals(driver.findElement(By.cssSelector("span#FirstName-error")).getText(), "First name is required.");
		Assert.assertEquals(driver.findElement(By.cssSelector("span#LastName-error")).getText(), "Last name is required.");
		Assert.assertEquals(driver.findElement(By.cssSelector("span#Email-error")).getText(), "Email is required.");
		Assert.assertEquals(driver.findElement(By.cssSelector("span#Password-error")).getText(), "Password is required.");
		Assert.assertEquals(driver.findElement(By.cssSelector("span#ConfirmPassword-error")).getText(), "Password is required.");

		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	@Test
	public void TC_02_Register_Invalid_Email() {
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Hara");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("Mai@1111");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("111111");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("111111");

		driver.findElement(By.cssSelector("button#register-button")).click();

		Assert.assertEquals(driver.findElement(By.cssSelector("div.message-error li")).getText(), "Wrong email");
		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	@Test
	public void TC_03_Register_Success() {
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Hara");
		driver.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
		driver.findElement(By.cssSelector("input#Password")).sendKeys("111111");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("111111");

		driver.findElement(By.cssSelector("button#register-button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div.result")).getText(), "Your registration completed");

		driver.findElement(By.cssSelector("a.ico-logout")).click();
		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	@Test
	public void TC_04_Register_Existing_Email() {
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Hara");
		driver.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
		driver.findElement(By.cssSelector("input#Password")).sendKeys("111111");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("111111");

		driver.findElement(By.cssSelector("button#register-button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div.message-error li")).getText(), "The specified email already exists");

		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	@Test
	public void TC_05_Register_Password_Less_Than_6_Chars() {
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Hara");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("mai55555@mail.net");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("111");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("111");

		driver.findElement(By.cssSelector("button#register-button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("span#Password-error")).getText(), "Password must meet the following rules:\nmust have at least 6 characters");

		driver.findElement(By.cssSelector("a.ico-register")).click();
	}

	@Test
	public void TC_06_Register_Invalid_Confirm_Password() {
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Mai");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Hara");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("mai55555@mail.net");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("111111");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("111122");

		driver.findElement(By.cssSelector("button#register-button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("span#ConfirmPassword-error")).getText(), "The password and confirmation password do not match.");
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
