package command;

public class GetUpCommand implements Command {

	private Trainee trainee;
	
	public GetUpCommand(Trainee trainee) {
		this.trainee=trainee;
	}
	@Override
	public void execute() {
		trainee.setTraining("Get Up");

	}

}
