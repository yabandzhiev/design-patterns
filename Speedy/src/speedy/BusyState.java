package speedy;

public class BusyState implements State {
	
	public static final String stateName = "Busy preparing";

	@Override
	public void applyState(Worker worker) {
		worker.setState(this);

	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return stateName;
	}

}
