package javaOOP;

public class Topic_03_Method {

	//Non static
	private void showCarName() {
		System.out.println("Hyundai Tucson");
	}
	
	static void showCarColor() {
		System.out.println("White");
	}
	
	public static void main(String[] args) {
		//Gọi vào trong 1 hàm static khac được
		showCarColor();
		
		//Gọi qua instance/object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();

	}

}
