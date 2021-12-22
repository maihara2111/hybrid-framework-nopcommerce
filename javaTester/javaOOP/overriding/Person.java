package javaOOP.overriding;

public abstract class Person {

	//Option
	public void eat() {
		System.out.println("Suat cơm 20.000 VND");
	}
	
	//Must (Template)
	public abstract void sleep();
}
