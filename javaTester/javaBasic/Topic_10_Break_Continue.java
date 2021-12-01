package javaBasic;

public class Topic_10_Break_Continue {

	public static void main(String[] args) {
		//Nested for
		for (int i = 1; i < 10; i++) {
			System.out.println("Lần chạy của i (for trên) = " + i);
			
			//Mỗi 1 lần chạy for trên sẽ apply cho tất cả các lần chạy của for dưới này
			for (int j = 1; j <= 5; j++) {
				if (j == 4) {
					continue;
				}
				System.out.println("j= " + j);
			}
		}
	}

}
