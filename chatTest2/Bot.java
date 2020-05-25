package chatTest2;



public class Bot {
	
	public void messageBotAdded() {
		System.out.println("Bot has been added!");
	}
	public void messageForbiddenWord() {
		System.out.println("Bot: 'cat' is forbidden!");
	
	}
	
	
	
	public void removeFromChat(User user) {
		MessagesMediator.removeTheUser(user);
	}
}
