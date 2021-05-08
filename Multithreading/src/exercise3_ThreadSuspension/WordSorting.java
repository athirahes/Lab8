package exercise3_ThreadSuspension;

import java.util.Arrays;
import java.util.Collections;

public class WordSorting implements Runnable {

	// array for method randomizeWords()
	private String word[] = { "It", "is", "recommended", "to", "use", "Calendar", "class." };

	// overloaded method - display thread name & method's data in random order.
	public void randomizeWords(String threadName) {

		System.out.print(threadName + "-> Array Original order: ");

		// Display the original order of the array's elements
		for (int i = 0; i < word.length; i++)
			System.out.print(word[i] + " ");

		// Randomize the elements's order
		Collections.shuffle(Arrays.asList(word));

		// Display the randomized order of the array's elements
		System.out.print("\n\n" + threadName + "-> Array Randomized order: ");
		for (int i = 0; i < word.length; i++) {

			// implementation suspend for 5 seconds when a thread “word1” is executing.
			if (threadName == "word1") {

				try {
					System.out.print(word[i] + " ");

					// suspend current thread for 5 second
					Thread.sleep(5000);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else // word2 is executing
				System.out.print(word[i] + " ");

		}
		System.out.println("\n\n" + threadName + "->Suspended");
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
				System.out.print("[" + word + "] ");

			System.out.println();

		}

	}

	@Override
	public void run() {

		// Get current thread & its name
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();

		// if threadName = text, then execute method b->extractTextPortion()
		if (threadName == "text")
			extractTextPortion();

		// if threadName = word1 or word2, then execute method c->randomizeWords()
		else if (threadName == "word1" || threadName == "word2")
			randomizeWords(threadName);

	}

}
