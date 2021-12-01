package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_11_Array {

	public static void main(String[] args) {

//		int number[] = { 12, 7, 5, 61, 15 };
//		int [] student = { 12, 7, 5, 61, 15 };
//
//		//Lấy ra phần tử đầu tiên 
//		System.out.println(student[0]);
//		System.out.println(student[1]);
//		System.out.println(student[5]);
		
		// Được define cố định bao nhiêu phần tử khi mình viết code (Compile)
		String studentName[] = {"Mai","Hara","MH"};
		studentName[0] = "Mai Hara";
		
		String stdNewName[] = studentName.clone();
		
		for (int i = 0; i < studentName.length; i++) {
			if (studentName[i].equals("Hara")) {
				System.out.println(studentName[i]);
			}
		}
		
		//Ko kết hợp vs điều kiện 
		for (String std : studentName) {
			if (std.equals("Hara")) {
				System.out.println("Click vao Hara");

			}
			System.out.println(std);
		}
		
		ArrayList<String> stdName = new ArrayList<String>();
		
		//Khi chay code mới add
		for (String std : studentName) {
			stdName.add(std);
		}
		
		List<String> names = Arrays.asList("Tom","Jerry","Donald");
		for (String name : names) {
			System.out.println("Name: " + name);
		}
	}
}
