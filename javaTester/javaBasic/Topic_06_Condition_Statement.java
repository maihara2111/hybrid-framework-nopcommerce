package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	public void TC_01_If() {
		boolean status = 5 > 3;
		System.out.println(status);

		// HÃ m if sáº½ nháº­n vÃ o 1 Ä‘iá»‡n kiá»‡n Ä‘Ãºng
		//Kiá»ƒm tra duy nháº¥t 1 Ä‘iá»�u kiá»‡n
		//if Ä‘iá»�u kiá»‡n Ä‘Ãºng thÃ¬ sáº½ action (xxx) trong pháº§n thÃ¢n
		if (status == true) {
			// Ä�Ãºng thÃ¬ vÃ o pháº§n thÃ¢n if
			// sai thÃ¬ bá»� qua
			System.out.println("Go to if");
		}
		
		WebDriver driver = new FirefoxDriver();
		
		//Element lun cÃ³ trong DOM
		WebElement salePopup = driver.findElement(By.id(""));
		if (salePopup.isDisplayed()) {
		}

		//ELement ko cÃ³ trong DOM
		List<WebElement> salePopups = driver.findElements(By.id(""));
		
		//Check element ko hiá»ƒn thá»‹
		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
		}
		
		//GÃ¡n (assign)
		int studentNumber = 10;
		
		//So sÃ¡nh: ==
		status = (studentNumber == 10);
		System.out.println(status); //=> status = true
		
		status = (studentNumber != 10);
		System.out.println(status); //=> status = false
		
		//Uncheck to checkbox
		WebElement languagesCheckbox = driver.findElement(By.id(""));
		if (languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		
		//Check to checkbox
		if (!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
	}

	public void TC_02_If_Else() {
		//CÃ³ 2 Ä‘iá»�u kiá»‡n: náº¿u Ä‘Ãºng thÃ¬ vÃ o if - sai thÃ¬ vÃ o else
		
		//If driver start vs browser chrome/firefox/edge/safari thÃ¬ dÃ¹ng hÃ m click
		//thÃ´ng thÆ°á»�ng (builin) cá»§a selenium
		
		//Neu driver lÃ  IE thÃ¬ dÃ¹ng hÃ m click cá»§a JavascriptExecutor
		System.setProperty("webdriver.chrome.driver", projectPath + "//BrowserDrivers/IEDrvierServer.exe");
		driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.chrome.driver", projectPath + "//BrowserDrivers/chromedriver.exe");
		//driver = new ChromeDriver();
		System.out.println(driver.toString());
		
		if (driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");
		} else {
			System.out.println("Click by Selenium WebElement");

		}
	}

	@Parameters("browser")
	@Test
	public void TC_03_If_Else_If_Else(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "//BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "//BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "//BrowserDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "//BrowserDrivers/IEDrvierServer.exe");
			driver = new InternetExplorerDriver();
		} else { //Safari/ opera/ coccoc/...
			throw new RuntimeException("Please input correct the browser name!");
		}
		
		System.out.println(browserName);
		System.out.println(driver.toString());
	
		driver.quit();
	}
	
	@Test
	public void TC_04_If_Else_If_Else() {
		//Page Object
		//Dynamic Page
		
		String pageName = "Login";
		if (pageName.equals("login")) {
			//LoginPage loginPage = new LoginPage();
			//return loginPage;
		} else if (pageName.equals("Register")) {
			//RegisterPage registerPage = new RegisterPage();
			//return registerPage;
		} else if (pageName.equals("New Customer")) {
			//CustomerPage customerPage = new CustomerPage();
			//return customerPage;
		} else {
			//HomePage homePage = new HomePage();
			//return homePage;
		}
		
		//if-else
		int age = 20;
		String access = (age < 18) ? "You can not access" : "Welcome to our system!";
		
		if (age <18) {
			access = "You can not access";
		} else {
			access = "Welcome to our system!";
		}
		
		System.out.println(access);
	}
}
