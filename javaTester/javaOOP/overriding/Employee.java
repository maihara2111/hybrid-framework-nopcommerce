package javaOOP.overriding;

public class Employee extends Person implements IWork {

	@Override
	public void eat() {
		System.out.println("Suat cơm 25.000 VND");
	}
	
	@Override
	public void sleep() {
		System.out.println("Ngủ 7 tiếng/ 1 ngày");
	}

	@Override
	public void workingTime() {
		System.out.println("Làm 8 tiếng/ 1 ngày");
	}
}
