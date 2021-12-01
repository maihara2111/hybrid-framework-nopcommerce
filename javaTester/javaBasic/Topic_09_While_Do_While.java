package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

//Class
public class Topic_09_While_Do_While {
	static Scanner scanner = new Scanner(System.in);

	// Function
	public static void main(String[] args) {
		// int i = 0;
		//
		// // Block code
		// for (i = 0; i < 5; i++) {
		// System.out.println("For: " + i);
		// }
		// System.out.println("Bien i sau khi done vong for: " + i);
		//
		// // i=5 ko thoa man điều kiện cua while
		// while (i < 5) {
		// System.out.println("While: " + i);
		// i++;
		// }
		//
		// // Chay it nhất 1 lần rồi mới ktra đk
		// do {
		// System.out.println("Do - While: " + i);
		// i++;
		// } while (i < 5);

		// TC_01_For();
		TC_02_While();
		// TC_03_Do_While();
	}

	@Test
	public static void TC_01_For() {
		int number = scanner.nextInt();
		for (int i = number; i < 100; i++) {
			// chia hết cho 2
			// 97/2 = 48
			// 97%2 = dư 1
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	@Test
	public static void TC_02_While() {
		int number = scanner.nextInt();

		while (number < 100) {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		}
	}

	@Test
	public static void TC_03_Do_While() {
		int number = scanner.nextInt();

		do {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		} while (number < 100);
	}

	@Test
	public static void TC_04_While() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		while (numberA < numberB) {
			if (numberA % 3 == 0 && numberA % 5 == 0) {
				System.out.println(numberA);
			}
			numberA++;
		}
	}

	@Test
	public static void TC_05_While() {
		int numberA = scanner.nextInt();
		int i = 0;

		while (numberA > 0) {
			if (numberA % 2 != 0) {
				i += numberA;
			}
			numberA--;
		}
		System.out.println(i);

	}
	@Test
	public static void TC_06_While() {
		int numberA = scanner.nextInt();
		int i = 1;

		while (numberA > 0) {
				i *= numberA;
				numberA--;
			}
		System.out.println(i);

	}
}
