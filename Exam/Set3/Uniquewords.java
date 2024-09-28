import java.util.*;

public class Uniquewords {

    // Function to return a list of unique words from a string (case-insensitive)
    public static List<String> getUniqueWords(String sentence) {
        // Convert the sentence to lowercase to make the comparison case-insensitive
        String lowerCaseSentence = sentence.toLowerCase();

        // Split the sentence into words, using space(s) as delimiter
        String[] words = lowerCaseSentence.split("\\s+");

        // Use a Set to store unique words
        LinkedHashSet<String> uniqueWordsSet = new LinkedHashSet<>(Arrays.asList(words));

        // Convert the Set to a List and return it
        return new ArrayList<>(uniqueWordsSet);
    }

    public static void main(String[] args) {
        // Example input
        String sentence = "Hello world hello";

        // Get and print the list of unique words
        List<String> uniqueWords = getUniqueWords(sentence);
        System.out.println("Unique words: " + uniqueWords);
    }
}
