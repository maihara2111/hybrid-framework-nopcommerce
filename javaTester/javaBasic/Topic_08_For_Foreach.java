package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	WebDriver driver;

	public void TC_01_For() {

		//i trong vòng for là biến cục bộ
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Vế 1: biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		// Dùng để so sánh vs tổng gtri
		// Vế 2: so sánh vs tổng
		// Vế 3: tăng i lên 1 đơn vị sau khi chạy vào thân vòng for

		// Lần 1:
		// i = 0
		// 0 < 5: đúng
		// System.out.println(0)
		// i++: tăng lên 1 dvi (i=1)

		// Lần 2:
		// i = 1
		// 1 < 5: đúng
		// System.out.println(1)
		// i++: tăng lên 1 dvi (i=2)

		// Lần 3:
		// i = 2
		// 2 < 5: đúng
		// System.out.println(2)
		// i++: tăng lên 1 dvi (i=3)

		// Lần 4:
		// i = 3
		// 3 < 5: đúng
		// System.out.println(3)
		// i++: tăng lên 1 dvi (i=4)

		// Lần 5:
		// i = 4
		// 4 < 5: đúng
		// System.out.println(4)
		// i++: tăng lên 1 dvi (i=5)

		// Lần 6:
		// i = 5
		// 5 < 5: sai
	}

	@Test
	public void TC_02_For() {
		// List<WebElement> links= driver.findElements(By.id(""));
		// links.size();

		// Array
		String[] cityName = { "HN", "HCM", "DN", "CT", "HP", "NT" };

		// Array/ List/ Set/ Queue (index)
		// 0

		// For kết hợp if: thỏa mãn đk mới action
		// Bien đếm - dùng để đk filter
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("DN")) {
				// Action
				System.out.println("Do action!");
				break;
			}
			System.out.println(cityName[i]);
		}

		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i].equals("DN")) {
				// Action
				System.out.println("Do action!");
				// Tất cả gia tri (element) đều đc chạy qua dù đã thỏa điều kiện rồi

			}

			System.out.println(cityName[i]);
		}

		// for each dùng chạy qua hết tất cả giá trị
		int y = 0;
		for (String city : cityName) {
			if (cityName[y].equals("DN")) {
				// Action
				System.out.println("Do action!");
				System.out.println(city);
				break;
			}
			y++;
		}
	}

	@Test
	public void TC_03_For() {
		for (int i = 1;; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void TC_02_For_Each() {
		// Array
		String[] cityName = { "HN", "HCM", "DN", "CT", "HP", "NT" };
		
		//for (String city : cityName) {
		//	System.out.println(city);
		//}
		
		//Java collection
		//Class: ArrayList/ LinkedList/ Vector/...
		//Interface: List/ Set/ Queue
		List<String> cityAddress = new ArrayList<>();
	
		//Compile (Coding)
		cityAddress.add("BGG");
		cityAddress.add("HGG");
		cityAddress.add("SAPA");
	
		//Runtime(Running)
		for (String city : cityName) {
			cityAddress.add(city);
		}
	
		System.out.println(cityAddress.size());
		
		for (String cityAdd : cityAddress) {
			System.out.println(cityAdd);
		}
		
		//Java Generic
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		//Xu li du lieu/ get text/ value/ css/ attribute
		for (WebElement link : links) {
			//Chuyen page
			//Refresh DOM/ HTML
			//Ko còn tồn tai
			//fail >> StaleElementException
		}
		
		//Sort
	}

}
