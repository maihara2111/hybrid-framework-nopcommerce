package javaOOP;

public class Topic_04_Non_Access_Modifier {
	// Static: Variable/ Method
	// Dùng cho tất cả các instance/ object
	// Phạm vi cho toàn bộ system sử dụng nó
	// Có thể override được
	static String browserName = "Chrome";

	// Non static
	String serverName = "Testing";

	// final phải gán giá trị từ đầu
	// Hằng số
	final String colorCar = "Red";

	final static String REGISTER_BUTTON = "";

	public static void main(String[] args) {
		System.out.println(browserName);

		browserName = "Firefox";
		System.out.println(browserName);

		Topic_04_Non_Access_Modifier topic04 = new Topic_04_Non_Access_Modifier();
		System.out.println(topic04.serverName);

		// bien fianl Ko đc phép gán lại giá trị
		System.out.println(topic04.colorCar);

		topic04.clickToElement("Button");

		sendkeyToElement("Textbox");
	}

	// Non static
	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}

	// Static
	public static void sendkeyToElement(String elementName) {
		System.out.println(elementName);
	}
	
	public final void setCarName() {
		
	}
}
