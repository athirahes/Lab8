package exercise1_SimpleMultithreading;
public class StatementPrinterApplication {

	public static void main(String[] args) {

		// create 2 objects of Thread
		StatementPrinter stmt1 = new StatementPrinter();
		StatementPrinter stmt2 = new StatementPrinter();

		// set name to the Thread objects
		stmt1.setName("Thread printThread1 ");
		stmt2.setName("Thread printThread2 -");
		
		// Execute thread
		stmt1.start();
		stmt2.start();
		
	}

}
