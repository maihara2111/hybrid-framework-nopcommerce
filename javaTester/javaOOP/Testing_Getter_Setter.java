package javaOOP;

public class Testing_Getter_Setter {

	public static void main(String[] args) {
		Topic_06_Getter_Setter topic = new Topic_06_Getter_Setter();
	
		//Happy Case
		topic.setPersonName("Mai Hara");
		System.out.println(topic.getPersonName());
		
		//Unhappy case
		topic.setPersonName("");
		System.out.println(topic.getPersonName());
	}

}
