package chatTest2;

public class Main {

	public static void main(String[] args) {
		MediatorForChat mediator = new MessagesMediator();
		User user1 = new ChatUser(mediator, "Ivan");
		User user2 = new ChatUser(mediator, "Andrei");
		User user3 = new ChatUser(mediator, "Georgi");
		
		user1.send("Hello mates");
		user2.send("cats");
		user3.send("addbot");
		user2.send("cats");
		user3.send("haha");

	}

}
