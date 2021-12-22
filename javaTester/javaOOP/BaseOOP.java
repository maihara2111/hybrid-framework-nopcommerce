package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP extends SeleniumWebDriver {
	WebDriver driver;

	public long shortTimeout = 15;
	protected long longTimeout = 45;

	public BaseOOP() {
		System.out.println("Constructor tại class cha");
	}
	
	public BaseOOP(String name) {
		System.out.println("Constructor tại class cha" + name);
	}
	
	public BaseOOP(int number) {
		System.out.println("Constructor tại class cha" + number);
	}
	
	public void setImplicitWait() {
		long shortTimeout = 15;
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
	}

}
