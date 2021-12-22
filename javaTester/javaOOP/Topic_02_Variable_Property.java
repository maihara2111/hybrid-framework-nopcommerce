package javaOOP;

public class Topic_02_Variable_Property {
	static int studentNumber;
	static int studentCountry;
	static int studentStatus;
	
	//Access Modifier
	//Data Type
	//Variable name
	//Variable value
	private String studentName = "Automation FC"; //Bien toan cuc (Global Variable)
	
	//Access modifier: default
	int studentID = 211194;
	
	//Static variable: dùng và gán lại được
	public static String studentAddress = "HCM";
	
	//Dùng trong phạm vi Class này (cho tất cả instance/ object dùng)
	private static String studentPhone = "0343725555";
	
	//Final variable: ko cho phép gán lại/ ko override lại
	//Cố định dữ liệu ko được phép thay đổi trong quá trình chạy
	final String country = "VN";
	
	//Static final variable: hằng số
	//Ko được ghi đè
	//Co` thể truy cập rộng rãi cho tất cả các instance/ thread
	static final float PI_NUMBER = 3.1455555f;
	
	
	public static void main(String[] args) {
		//Local variable - bien cuc bo: hàm
		String studentName = "Mai Boyy";
		
		if (studentName.startsWith("Automation")) {
			//Local variable - bien cuc bộ" block code
			int number = 100;
		}
		
		studentAddress = "PT";
		studentPhone = "0333333333";
		
		System.out.println(studentNumber);
		System.out.println(studentCountry);
		System.out.println(studentStatus);
	}
	
	public Topic_02_Variable_Property() {
		//Local variable - bien cuc bo: contructor
		String studentName = "Automation FC";
		
	}

	//Ham (Method)
	public void display() {
		//Local variable - bien cuc bo: hàm
		//Local variable bắt buộc phải khởi tạo mới được sử dụng
		String studentName = "Mai Hara";
		
		if (studentName.startsWith("Automation")) {
			
		}
	}
}
