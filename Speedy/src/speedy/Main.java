package speedy;



public class Main {
	
	private static Worker getWorker() {
		WaitingState waitingState = new WaitingState();
		Worker workerAbroad = new WorkerAbroad("abroad", waitingState);
		
		Worker workerCountry = new WorkerCountry("country", waitingState);
		
		Worker workerPlovdiv = new WorkerPlovdiv("plovdiv", waitingState);
		
		Observer watcher = new Watcher("Watcher");
				
		workerAbroad.attach(watcher);
		workerCountry.attach(watcher);
		workerPlovdiv.attach(watcher);
		
		workerPlovdiv.setNextWorker(workerCountry);
		workerCountry.setNextWorker(workerAbroad);;
		
		return workerPlovdiv;
	}
	


	public static void main(String[] args) {
		

		
		Worker worker = getWorker();
		
		worker.handleMessage("plovdiv", 3);
		
		worker.handleMessage("country", 2);
		
		worker.handleMessage("abroad", 1);
		
		worker.handleMessage("plovdiv", 3);
		
		
		
	}

}
