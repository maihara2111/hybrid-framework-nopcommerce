package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array_Exercise {
	int number[] = { 5, 8, 15, -2, 7, 60 };

	@Test
	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Max number = " + x);
	}
	
	@Test
	public void TC_02_Sum_First_And_Last_Number() {
		int x = 0;
			x = number[0] + number[number.length - 1];
			System.out.println("Sum = " + x);
	}
	
	@Test
	public void TC_03_Even_Number() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("Even number = " + number[i]);
			}
		}
	}
	
	@Test
	public void TC_04_0_10() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0 && number[i] < 10) {
				System.out.println("0 < number < 10 " + number[i]);
			}
		}
	}
	
	@Test
	public void TC_05_Sum_Average() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum/number.length);
	}
}
