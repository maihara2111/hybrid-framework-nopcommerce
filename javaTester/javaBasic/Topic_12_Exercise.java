package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {
	String courseName = "Automation 21 Testing 11 Advance 1994";

	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		for (char character : courseNameArr) {
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
		}
		for (char character : courseNameArr) {
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}
		}
		for (char character : courseNameArr) {
			if (character <= '9' && character >= '0') {
				countNumber++;
			}
		}
		
		System.out.println("CountUpper = " + countUpper);
		System.out.println("CountLower = " + countLower);
		System.out.println("CountNumber = " + countNumber);
	}
	
	@Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char c : courseNameArr) {
			if (c == 'o') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();
		
		for (int i = courseNameArr.length - 1; i >=0; i--) {
			System.out.println(courseNameArr[i]);
		}
	}
}
