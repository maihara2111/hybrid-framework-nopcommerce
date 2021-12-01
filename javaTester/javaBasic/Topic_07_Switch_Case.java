package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	@Parameters("browser")
	//@Test
	public void TC_01_Switch_Case(String browserName) {
		driver = getBrowserDriver(browserName);
		System.out.println(browserName);
	
		driver.quit();
	}
	
	@Test
	public void TC_02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Thang nay co 31 ngay");
			break;
		case 2:
			System.out.println("Thang nay co 28 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Thang nay co 30 ngay");
			break;
		default:
			System.out.println("Vui long nhap thang trong khoang [1-12]");
			break;
		}
	}
	
	@Test
	public void TC_04() {
		//Only convertible int values, strings or enum variables are permitted
		
		//enum variables = constant
		//Chỉ nhận string/ int/enum
		//ko dùng vs cac toán tử trong case
		String operator = scanner.nextLine();
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println("A + B = " + (firstNumber + secondNumber));
			break;
		case "-":
			System.out.println("A - B = " + (firstNumber - secondNumber));
			break;
		case "x":
			System.out.println("A x B = " + (firstNumber * secondNumber));
			break;
		case "/":
			System.out.println("A / B = " + (firstNumber / secondNumber));
			break;
		case "%":
			System.out.println("A % B = " + (firstNumber % secondNumber));
			break;

		default:
			break;
		}
		//Case studentPoint ko dung switch case dc
		/*
		 * int studentPoint = scanner.nextInt(); if (studentPoint <= 10 && studentPoint
		 * >= 8.5) { System.out.println("He so A"); } else if (studentPoint < 8.5 &&
		 * studentPoint >= 7.5) { System.out.println("He so B"); } else if (studentPoint
		 * < 7.5 && studentPoint >= 5) { System.out.println("He so C"); } else if
		 * (studentPoint < 5 && studentPoint >= 0) { System.out.println("He so D"); }
		 * else { System.out.println("Ban vui long nhap lai"); }
		 */
	}
	
	public WebDriver getBrowserDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "//BrowserDrivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "//BrowserDrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "//BrowserDrivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", projectPath + "//BrowserDrivers/IEDrvierServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			new RuntimeException("Please input correct the browser name!");
			break;
		}
		return driver;
	}
	
	
}
