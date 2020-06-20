package speedy;

import java.util.ArrayList;
import java.util.List;

public abstract class Worker implements Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	private State state;

	public static int WORKER_ABROAD = 1;
	public static int WORKER_COUNTRY = 2;
	public static int WORKER_PLOVDIV = 3;

	protected int level;
	private String name;
	protected Worker nextWorker;

	public Worker() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setNextWorker(Worker worker) {
		this.nextWorker = worker;
	}

	public void attach(Observer observer) {
		this.observers.add(observer);
		observer.setWorker(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void handleMessage(String message, int level) {

		if (this.level <= level) {
			this.workerMessage(message);
			return;
		}

		if (this.nextWorker != null) {
			this.nextWorker.handleMessage(message, level);
		}
	}

	abstract protected void workerMessage(String message);

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.getState().getStateName();
	}
}
