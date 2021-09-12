package javaBasic;

import java.util.Scanner;

public class Topic_01_Varible {
	
	public Topic_01_Varible() {
		
	}
	
	static int studentNumber;
	static boolean statusValue;
	static final String BROWSER_NAME = "Chrome";//constant
	
	protected String studentName="Automation FC";
	
	public static void main(String[] args) {
		int studentPrice = 222;
		System.out.println(studentPrice);
		
		
		System.out.println(studentNumber);
		System.out.println(statusValue);
		System.out.println(Topic_01_Varible.BROWSER_NAME);
		
		Topic_01_Varible topic = new Topic_01_Varible();
		
		System.out.println(topic.studentName);
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		System.out.println(name);
		System.out.print(name);
		System.out.print(name);
		
	}
	
	//Getter: getCurrentUrl/ getTitle/ getText/getAttribute/getCssValue/getSize/getLocation/getPosition...
	public String getStudentName() {
		return this.studentName;
	}
	
	//Setter: click/sendkey/clear/select/back/forward/refresh/get
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}
}
