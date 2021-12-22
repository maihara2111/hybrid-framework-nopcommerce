package javaBasic;

public class Topic_14_StringFormat {

	// 14 pages = 14 biến locator
	public static String ADDRESS_PAGE = "//div[contains(@class,'block-account-navigation')]//a[text()='Addresses']";
	public static String REWARD_POINT_PAGE = "//div[contains(@class,'block-account-navigation')]//a[text()='Reward points']";
	public static String MY_PRODUCT_REVIEW_PAGE = "//div[contains(@class,'block-account-navigation')]//a[text()='My product reviews']";

	// 1 biến cho cả 14 pages hoặc n pages (format giong nhau - chỉ khác nhau bởi tên page)
	public static String DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME = "//div[contains(@class,'block-account-navigation')]//a[text()='%s']";

	// 1 Locator để đại diện cho các page (Header/ Sidebar/ Footer)
	public static String DYNAMIC_LINK_BY_PAGE_NAME = "//div[contains(@class,'%s')]//a[text()='%s']";

	public static void main(String[] args) {
		clickToLink(ADDRESS_PAGE);
		clickToLink(REWARD_POINT_PAGE);
		clickToLink(MY_PRODUCT_REVIEW_PAGE);

		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Addresses");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Reward points");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "My product reviews");

		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "block-account-navigation", "Addresses");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "header-links", "Register");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "footer-upper", "Search");

	}

	public static void clickToLink(String locator) {
		System.out.println("Click to: " + locator);
	}

	// 1 tham số động
//	public static void clickToLink(String dynamicLocator, String pageName) {
//		String locator = String.format(dynamicLocator, pageName);
//		System.out.println("Click to: " + locator);
//	}

	// 2 tham số đông
//	public static void clickToLink(String dynamicLocator, String areaName, String pageName) {
//		String locator = String.format(dynamicLocator, areaName, pageName);
//		System.out.println("Click to: " + locator);
//	}

	// 1-n tham số động
	public static void clickToLink(String dynamicLocator, String... params) {
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Click to: " + locator);
	}
}
