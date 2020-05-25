package chatTest2;

import java.util.ArrayList;
import java.util.List;



public class MessagesMediator implements MediatorForChat {
	
	private static List<User> users;
	private FactoryLink botFacLink = new FactoryLink();
	private Bot bot;


	public MessagesMediator() {
		MessagesMediator.users = new ArrayList<>();
	}
	
	

	@Override
	public void sendMessage(String message, User user) {
		
		
		for(User u : MessagesMediator.users) {
			if (u!= user) {
				u.receive(message);
			}
		}
		if (message.equalsIgnoreCase("addbot")) {
				bot = botFacLink.makeBot();
				bot.messageBotAdded();
		}
		if (message.contains("cat") && bot != null) {
			bot.removeFromChat(user);
			bot.messageForbiddenWord();
		}

	}
	
	

	@Override
	public void addUser(User user) {
		MessagesMediator.users.add(user);

	}
	public static  void removeTheUser(User user) {
		if (users.contains(user)) {
			
			users.remove(user);
			user.mediator = null;
			System.out.println(user.nickname + " is removed from chat.");
		}
	}

	


	
	

}
