package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	//Global varible
	static int number;
	//String address = "Mai Hara";
	
	//Primitive type/ value type: Nguyên thủy
	byte bNumber = 6;
	
	short sNumber = 6666;
	
	int iNumber = 2222;
	
	long lNumber = 65555;
	
	float fNumber = 1.111f;
	
	double dNumber = 1.11d;
	
	char cChar = 'm';
	
	boolean bStatus = true;
	
	//Reference type: tham chiếu
	//String
	String address = "DN";
	
	//Array
	String[] studentAddress = { address, "HCM", "HN"};
	Integer[] studentNumber = { 66, 666, 6666};
	
	//Class
	Topic_02_Data_Type topic;
	
	//Interface
	WebDriver driver;
	
	//Object
	Object aObject;
	
	//Collection
	//List/Set/Queue/Map
	List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
	Set<String> allWindows = driver.getWindowHandles();
	
	List<String> productName = new ArrayList<String>();
	
	public void clickToElement() {
		address.trim();
		
		studentAddress.clone();
		
		driver.getCurrentUrl();
		
		aObject.toString();
		
		homePageLinks.size();
		
		allWindows.clear();
		
		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		
		topic.address = "HCM";
		
	}
	
	public static void main(String[] args) {
		//Local varible
		int studentNumber = 0;
		
		System.out.println(number);
		
		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		System.out.println(topic.address);
		
		System.out.println(studentNumber);

	}

}
