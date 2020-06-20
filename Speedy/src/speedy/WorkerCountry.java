package speedy;

public class WorkerCountry extends Worker {
	
	public WorkerCountry(String name, State state) {
		this.level=Worker.WORKER_COUNTRY;
		this.setName(name);
		this.setState(state);
	}

	@Override
	protected void workerMessage(String message) {
		if (message.equalsIgnoreCase("country")) {
			BusyState busyState = new BusyState();
			busyState.applyState(this);
			System.out.println("Country Worker is taking care of the package");
			this.notifyObservers();
			System.out.println("The Country Worker is waiting");
		}

	}

}
