package eclipseTips;

public class Topic_04_Access_Modifier {

	public static void main(String[] args) {
		Topic_03_Getter_Setter topic_03 = new Topic_03_Getter_Setter(null);
		topic_03.setCarName("Ferrari");
		
		System.out.println(topic_03.getCarName());
	}

}
