package com.nopcommerce.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class User_01_Register_Login {
	//Toan cuc
	String homePageUrl="";
	
	@BeforeClass
	public void beforeClass() {
	}

	@Test
	public void TC_01() {
		//Cục bộ: use trong phạm vi của toan testcase/ hàm
		String homePageUrl = "";
		System.out.println(homePageUrl);
		
		//Block code
		if(3<5) {
			//cục bộ
			String homePageTitle = "";
			
			System.out.println(homePageTitle);
		}
		
	}

	@Test
	public void TC_02() {
	}

	@AfterClass
	public void afterClass() {
	}

}
