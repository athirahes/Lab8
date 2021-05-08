package exercise3_ThreadSuspension;

public class WordSortingApplication {

	public static void main(String[] args) {


		// Create objects of Runnable
		Runnable sorting1 = new WordSorting();
		Runnable sorting2 = new WordSorting();
		Runnable sorting3 = new WordSorting();
		
		// Create objects of thread		
		Thread thread1 = new Thread(sorting1);
		Thread thread2 = new Thread(sorting2);
		Thread thread3 = new Thread(sorting3);
		
		// Set name for each objects of thread
		thread1.setName("text");
		thread2.setName("word1");
		thread3.setName("word2");
		
		// Execute thread
		thread3.start();
		thread1.start();
		thread2.start();
		
		
	}

}
