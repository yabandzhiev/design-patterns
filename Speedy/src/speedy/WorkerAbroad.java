package speedy;


public class WorkerAbroad extends Worker {
	
	
	
	public WorkerAbroad(String name, State state) {
		this.level=Worker.WORKER_ABROAD;
		this.setName(name);
		this.setState(state);
	}

	@Override
	protected void workerMessage(String message) {
		if (message.equalsIgnoreCase("abroad")) {
			BusyState busyState = new BusyState();
			busyState.applyState(this);
			System.out.println("Abroad Worker is taking care of the package");
			this.notifyObservers();
			System.out.println("The Abroad Worker is waiting");
		}
		
	}

	
}
