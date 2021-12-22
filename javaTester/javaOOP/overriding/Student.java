package javaOOP.overriding;

public class Student extends Person implements IWork{
	@Override
	public void eat() {
		System.out.println("Suat cơm 15.000 VND");
	}
	
	@Override
	public void sleep() {
		System.out.println("Ngủ 8 tiếng/ 1 ngày");
	}

	@Override
	public void workingTime() {
		System.out.println("Học 3 tiếng/ 1 ngày");
		
	}
}
