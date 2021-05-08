package exercise1_SimpleMultithreading;
import java.text.DateFormat;
import java.util.Date;

public class StatementPrinter extends Thread {

	// this method prints time and thread name
	public void printTimeAndName(String threadName) {
		
		// Retrieve current time
		String currentTime = DateFormat.getTimeInstance().format(new Date());

		// Display thread name in 10 repetition
		for (int counter = 0; counter < 10; counter++) {
			
			int j = counter+1;
			System.out.println(threadName + "->" + j +" [ " + currentTime + " ] ");
			
		}
		
		System.out.println();

	}

	public void run() {

		// Get current thread
		Thread currentThread = Thread.currentThread();

		// execute task
		printTimeAndName(currentThread.getName());
		
	}

}
