package command;

public class GetDownCommand implements Command {
	
	private Trainee trainee;
	
	public GetDownCommand(Trainee trainee) {
		this.trainee=trainee;
	}

	@Override
	public void execute() {
		trainee.setTraining("Get Down");

	}

}
