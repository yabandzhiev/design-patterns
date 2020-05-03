package observer;

public class Instructor {
	Trainee trainee;
	public Instructor(Trainee trainee)
	{
		this.trainee = trainee;
	}
	public void changeTraining(String newTraining)
	{
		this.trainee.setTraining(newTraining);
	}
	

}