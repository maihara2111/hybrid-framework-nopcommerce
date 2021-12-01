package javaBasic;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Exercise {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);

	public void TC_01() {
		int number = scanner.nextInt();

		int afternumber = number % 2;
		System.out.println(afternumber);

		boolean status = afternumber == 0;
		System.out.println(status);

		if (status) {
			System.out.println("So: " + number + " la so chan");
		} else {
			System.out.println("So: " + number + " la so le");

		}

	}

	// @Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		if (numberA >= numberB) {
			System.out.println(numberA + " > or = " + numberB);
		} else {
			System.out.println(numberA + " < " + numberB);

		}
	}

	// @Test
	public void TC_03() {
		String firstStudent = scanner.nextLine();
		String secondStudent = scanner.nextLine();

		// Reference: String
		// ktra value cua bien
		// ktra vi tri cua bien trong vung nho
		if (firstStudent.equals(secondStudent)) {
			System.out.println("2 ten giong nhau");
		} else {
			System.out.println("2 ten khac nhau");
		}
		// kieu opmitive type
		if (firstStudent == secondStudent) {
			System.out.println("2 ten giong nhau");
		} else {
			System.out.println("2 ten khac nhau");
		}
	}

	@Test
	public void TC_04_If_Else_If_Else() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();

		if (numberA > numberB && numberA > numberC) {
			System.out.println(numberA + " la so lon nhat");
		} else if (numberB > numberC) {
			System.out.println(numberB + " la so lon nhat");
		} else {
			System.out.println(numberC + " la so lon nhat");

		}
	}

	@Test
	public void TC_05() {
		int numberA = scanner.nextInt();
		if (10 < numberA && numberA < 100) {
			System.out.println(numberA + " nam trong [1, 100]");
		} else {
			System.out.println(numberA + " ko nam trong [1, 100]");

		}
	}

	@Test
	public void TC_06() {
		float studentPoint = scanner.nextFloat();
		if (studentPoint <= 10 && studentPoint >= 8.5) {
			System.out.println("He so A");
		} else if (studentPoint < 8.5 && studentPoint >= 7.5) {
			System.out.println("He so B");
		} else if (studentPoint < 7.5 && studentPoint >= 5) {
			System.out.println("He so C");
		} else if (studentPoint < 5 && studentPoint >= 0) {
			System.out.println("He so D");
		} else {
			System.out.println("Ban vui long nhap lai");
		}
	}

	@Test
	public void TC_07() {
		int month = scanner.nextInt();

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Thang nay co 31 ngay");
		} else if (month == 2) {
			System.out.println("Thang nay co 28 ngay");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Thang nay co 30 ngay");
		}
	}
}
