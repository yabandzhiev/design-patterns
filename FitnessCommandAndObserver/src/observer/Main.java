package observer;

public class Main {

	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		
		Instructor instructor = new Instructor(trainee);
		
		IObserver viewer1 = new Viewer();
		IObserver viewer2 = new Viewer();
		IObserver viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		instructor.changeTraining("Get Up");
		System.out.println();
		instructor.changeTraining("Get Down");

	}

}
