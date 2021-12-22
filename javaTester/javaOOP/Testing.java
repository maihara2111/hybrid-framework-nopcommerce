package javaOOP;

public class Testing {

	public static void main(String[] args) {
		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student();

		// Instance variable
		firstStudent.studentID = 211194;

		System.out.println(Topic_02_Variable_Property.studentAddress);

		Topic_02_Variable_Property.studentAddress = "HN";

		Topic_03_Method.showCarColor();

		// Bien static truy cap truc tiep từ tên class
		// ko cần phải tạo instance/ object
		// ko nên lạm dụng tạo các biến là static
		System.out.println(Topic_04_Non_Access_Modifier.browserName);

		// Khởi tạo các class
		Topic_04_Non_Access_Modifier.sendkeyToElement("Textbox");

		Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
		System.out.println(topic.colorCar);

		// ko báo lỗi trong quá trình compile
		// (trình biên dịch khi viết code sai/ ko đúng convention
		// - / vi phạm chuẩn của java sẽ báo lỗi ngay

		// 2 loại lỗi
		// lỗi compiler: trong quá trình viết code sẽ báo lỗi
		// Lỗi runtime: trong quá trình run system/ run testcase

		// Class
		// Kế thừa: nếu như dùng abstract class thì ko cho khởi tạo đối tượng
		// Final: cho khởi tạo đối tượng nhưng ko cho kế thừa
	}

	// Lớp lồng - ít dùng
	public static class NestedTesting {

	}
}
