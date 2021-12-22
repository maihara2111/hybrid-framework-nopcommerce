package javaOOP;

//Abstract Class
public abstract class Animal {

	// Variable
	String animalName = "Dog";
	
	//Method
	//ko có phần thân (body)
	//public, protected
	//bắt buộc các class con phải override các hàm này lại
	abstract void setAnimalName();
	
}
