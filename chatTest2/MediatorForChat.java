package chatTest2;



public interface MediatorForChat {

	void sendMessage(String message, User user);
	void addUser(User user);

}
