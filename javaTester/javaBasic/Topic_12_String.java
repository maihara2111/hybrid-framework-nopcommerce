package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//browserDrivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		String s1 = "Cat";
//		String s2 = s1;
//		String s3 = new String("Cat");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s3==s2);
//		
//		//equal So sanh gia tri chứ ko phải so sánh vùng nhớ
//		System.out.println(s2.equals(s3));

		String schoolName = "Automation Testing Advanced";
		String courseName = "AUTOMATION TESTING ADVANCED";
		String schoolAddress = "HCM city";

		System.out.println("Độ dài = " + schoolName.length());
		System.out.println("Lấy ra 1 kí tự = " + schoolName.charAt(0));
		System.out.println("Noi 2 chuỗi = " + schoolName.concat(schoolAddress));
		System.out.println("Noi 2 chuỗi = " + schoolName + schoolAddress);
		System.out.println("Kiem tra 2 chuoi = nhau tuyệt đối = " + schoolName.equals(schoolAddress));
		System.out.println("Kiem tra 2 chuoi = nhau tuyệt đối = " + schoolName.equals("Automation Testing Advanced"));

		// Apply Multi browser
		System.out.println("Kiem tra 2 chuoi = nhau tương đối = " + schoolName.equalsIgnoreCase(courseName));

		// startsWith/ endsWith/ contains
		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự = " + schoolName.startsWith("A"));
		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự = " + schoolName.startsWith("Automation"));
		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự = " + schoolName.startsWith("T"));

		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự = " + schoolName.contains("Automation"));
		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự = " + schoolName.contains("T"));

		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự = " + schoolName.endsWith("Advanced"));
		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự = " + schoolName.contains("d"));

		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự trong chuỗi " + schoolName.indexOf("Advanced"));
		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự trong chuỗi " + schoolName.indexOf("A"));
		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự trong chuỗi " + schoolName.indexOf("Testing"));
		System.out.println("Tách 1 kí tự/ chuỗi kí tự trong chuỗi " + schoolName.substring(11));
		System.out.println("Tách 1 kí tự/ chuỗi kí tự trong chuỗi " + schoolName.substring(11, 15));

		// Split: Tách chuỗi thành 1 mảng dựa vào kí tự/ chuỗi kí tự
		// Alert
		String result = "Viewing 48 of 132 results";
		String results[] = result.split(" ");
		System.out.println(results[1]);

		// Replace
		String productPrice = "$1000";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);

		// Sắp xếp nó: sort Data
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);

		productPrice = String.valueOf(productPriceF);
		System.out.println(productPrice);

		String osName = System.getProperty("os.name");
		System.out.println(osName);
		// Windows 10 = windows 10
		// Handle multiple OS: MAC/ Windows (Actions - keys - Ctrl/ Command)
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		} else {
			Keys key = Keys.COMMAND;
		}

		// Multiple browser: toUpperCase
		// firefox = FIREFOX (Enum)

		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);
		// FirefoxDriver: firefox on WINDOWS (9be5469e-18e5-4291-b57b-91b8d6a0c3e7)
		// Close browser/driver
		// if (driverInstanceName.contains("internetexplorer")) {
		// Sleep cứng thêm 5s sau mỗi sự kiện chuyển page
		// }

		// khoang trang / xuong dong/ tab
		String helloWorld = "	\n	\t		Hello World!		";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());

		helloWorld = " ";

		System.out.println("Empty = " + helloWorld.isEmpty());
		System.out.println("Blank = " + helloWorld.isBlank());
		
		//Dynamic locator
		//Đại diện cho 1 chuỗi %s
		//%b %t %d
		String dynamicButtonXpath = "//button[@id='5s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "Login"));
		System.out.println("Click to Search button = " + dynamicButtonXpath.format(dynamicButtonXpath, "Search"));
		System.out.println("Click to Register button = " + dynamicButtonXpath.format(dynamicButtonXpath, "Register"));
		
	}

}
