package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_05_This_Super extends BaseOOP {
	WebDriver driver;
	private int firstNumber;
	private int secondNumber;
	private long shortTimeout = 15;
//	protected long longTimeout = 45;
	
	public void setImplicitWait() {
		long shortTimeout = 15;
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(shortTimeout, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(this.shortTimeout, TimeUnit.SECONDS);

	}

	public void clickToElement() {
		// ko dùng super sẽ gọi qua hàm ở class con (hiện tại)
		setImplicitWait();

		// dùng super > gọi qua hàm ở lớp cha
		super.setImplicitWait();

		System.out.println(super.browserName);
	}

	public Topic_05_This_Super() {
//		//this phải nằm ở đầu statement
//		this(10, 13);
//		System.out.println("Demo");
//		
		//Luôn luôn gọi constructor của class cha
		super("Chrome");
		System.out.println("Constructor của class con");
	}

	public Topic_05_This_Super(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void showNumber() {
		this.sumNumber();
	}

	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super(10, 13);
		topic.sumNumber();
	}

}
