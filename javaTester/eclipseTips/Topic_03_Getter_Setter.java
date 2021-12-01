package eclipseTips;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_03_Getter_Setter {
	private String carName;
	private String carType;
	private String carColor;
	private String carMachine;
	//Biến global
	WebDriver driver;
	
	String address = new String("HCM");
	
	//Page Object Pattern
	//Contructor
	public Topic_03_Getter_Setter(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarMachine() {
		return carMachine;
	}
	public void setCarMachine(String carMachine) {
		this.carMachine = carMachine;
	}

	public void Login_01_Email_Invalid() {
		//Local
		WebDriver driver = null;
		
		//Local
		driver.get("");
		
		//global
		this.driver.get("");
	}
	
	
	@Test //Dev A: Underscore
	public void Login_01_Email_Empty() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(driver instanceof WebDriver);
	}

}
