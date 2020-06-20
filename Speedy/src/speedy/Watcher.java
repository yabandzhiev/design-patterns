package speedy;

import java.util.ArrayList;
import java.util.List;

public class Watcher implements Observer {
	
	private List<Observable> watcher = new ArrayList<>();
	private String name;

	
	public Watcher(String name) {
		this.name=name;
	}

	@Override
	public void update() {
		
		
		watcherInAction(watcher);

	}

	@Override
	public void setWorker(Observable observable) {
		this.watcher.add(observable);

	}
	
	private void watcherInAction (List<Observable> watchers){
        for(Observable observable : watchers){
            if(observable.getUpdate().equals("Busy preparing")) {
            	System.out.println(observable.getUpdate());
                System.out.println("The " + this.name + " sorts out the package");
                
                
                break;
            }
        }
	}

}
