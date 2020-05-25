package chatTest2;

public abstract class User {

	protected MediatorForChat mediator;
	protected String nickname;

	public User(MediatorForChat mediator, String nickname) {
	
		this.mediator=mediator;
		this.nickname=nickname;
		
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
}
