package javaBasic;

public class Topic_11_Array_01 {
	//Thuoc tính/ Biến
	String name;
	int age;
	
	//Constructor: hàm khởi tạo
	public Topic_11_Array_01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public static void main(String[] args) {
		Topic_11_Array_01[] students = new Topic_11_Array_01[3];
		
		students[0] = new Topic_11_Array_01("Mai", 27);
		students[1] = new Topic_11_Array_01("Hara", 17);
		students[2] = new Topic_11_Array_01("MH", 12);
		
		for (int i = 0; i < students.length; i++) {
			students[i].display();
		}
	}
	
}
