package speedy;

public class WorkerPlovdiv extends Worker {
	
	public WorkerPlovdiv(String name, State state) {
		this.level=Worker.WORKER_PLOVDIV;
		this.setName(name);
		this.setState(state);
	}

	@Override
	protected void workerMessage(String message) {
		if (message.equalsIgnoreCase("plovdiv")) {
			BusyState busyState = new BusyState();
			busyState.applyState(this);
			System.out.println("Plovdiv Worker is taking care of the package");
			this.notifyObservers();
			System.out.println("The Plovdiv Worker is waiting");
		}
	}

}
