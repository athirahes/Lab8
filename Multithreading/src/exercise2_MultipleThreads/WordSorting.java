package exercise2_MultipleThreads;
import java.util.Arrays;
import java.util.Collections;

public class WordSorting implements Runnable {

	// array for method randomizeWords()
	private String word[] = { "It", "is", "recommended", "to", "use", "Calendar", "class." };

	// method that will display the data in word[] array in random order.
		public void randomizeWords() {

			System.out.print("Original order: ");

			// Display the original order of the array's elements
			for (int i = 0; i < word.length; i++)
				System.out.print(word[i] + " ");

			// Randomize the elements's order
			Collections.shuffle(Arrays.asList(word));

			// Display the randomized order of the array's elements
			System.out.print("\nRandomized order: ");

			for (int i = 0; i < word.length; i++)
				System.out.print(word[i] + " ");

			System.out.println();

		}
	
	// method that will extract portions of text in 10 repetition
	public void extractTextPortion() {

		// Create the text that will be extracted
		String text = "this text will be portioned using the square brackets like this";

		// the word extraction increases in every repetition
		for (int counter = 1; counter <= 10; counter++) {

			// Extract word from text
			String extractedText[] = text.split(" ", counter);

			// Display extracted text
			System.out.print("Extract text into " + counter + " portion: ");
			for (String word : extractedText)
				System.out.print("[" + word + "]");

			System.out.println();

		}

	}

	@Override
	public void run() {

		// Get current thread & its name
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();

		System.out.println("Thread " + threadName + " is running...");
		
		// if threadName = text, then execute method b->extractTextPortion()
		if (threadName == "text")
			extractTextPortion();

		// if threadName = word1, then execute method c->randomizeWords()
		else if (threadName == "word1" || threadName == "word2")
			randomizeWords();
		
		System.out.println("Thread " + threadName + " is finished...\n");

	}

}
