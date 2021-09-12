package javaBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Topic_05_Reference_Casting {
	protected String studentName;
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName (String name) {
		this.studentName = name;
	}
	
	public void showStudentName() {
		System.out.println("studentName: " + studentName);
	}
	
	public static void main(String[] args) {
		Topic_05_Reference_Casting firstStudent = new Topic_05_Reference_Casting();
		Topic_05_Reference_Casting secondStudent = new Topic_05_Reference_Casting();
		
		firstStudent.setstudentName("Mai");
		secondStudent.setstudentName("Hara");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();

		//Ep kieu
		secondStudent = firstStudent;
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		secondStudent.setstudentName("Boyy");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		WebDriver driver = null;
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
	}

}
