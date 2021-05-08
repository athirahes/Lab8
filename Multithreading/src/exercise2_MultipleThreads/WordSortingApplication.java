package exercise2_MultipleThreads;

public class WordSortingApplication {

	public static void main(String[] args) {

		// Create objects of Runnable
		Runnable sorting1 = new WordSorting();
		Runnable sorting2 = new WordSorting();

		// Create objects of thread & set a name
		Thread thread1 = new Thread(sorting1, "text");
		Thread thread2 = new Thread(sorting2);
		thread2.setName("word1");

		// Execute thread
		thread1.start();
		thread2.start();

	}

}
