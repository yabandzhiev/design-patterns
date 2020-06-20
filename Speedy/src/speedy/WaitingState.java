package speedy;

public class WaitingState implements State {
	
	public static final String stateName="Waiting";

	@Override
	public void applyState(Worker worker) {
		worker.setState(this);

	}

	@Override
	public String getStateName() {
		
		return stateName;
	}

}
