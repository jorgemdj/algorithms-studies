import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null; // Initialize the champion word
        int count = 0; // Word counter

        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString(); // Read the next word
            count++; // Increment the word count

            // Replace the champion with probability 1/count
            if (Math.random() < 1.0 / count) {
                champion = currentWord;
            }
        }

        // Print the final champion
        if (champion != null) {
            StdOut.println("The chosen one is: " + champion);
        }
    }
}
