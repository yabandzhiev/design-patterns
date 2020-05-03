package command;

public class Instructor {
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void changeTraining() {
		System.out.println("The Instructor has changed the training");
		this.command.execute();
	}
}
