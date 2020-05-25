package chatTest2;

public class ChatUser extends User {

	public ChatUser(MediatorForChat mediator, String nickname) {
		super(mediator, nickname);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.nickname + " says: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.nickname + " received: " + message);

	}

}
