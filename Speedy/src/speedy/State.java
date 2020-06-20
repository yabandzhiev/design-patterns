package speedy;

public interface State {

	public void applyState(Worker worker);
	public String getStateName();
}
