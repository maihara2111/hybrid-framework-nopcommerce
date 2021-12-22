package javaOOP;

public class Person {
	private String personName;
	
	//Nested class/ inner class
	public class Pupil {
		String name = "";
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		//Person = Class
		//person = instance/ biến/ object
		person.personName = "";
		
		Person.Pupil pupil = person.new Pupil();
		pupil.name = "";
	}

}
