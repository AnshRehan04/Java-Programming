import java.util.Scanner;

public class  capital {
    static String capitalword(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
            }
        }
        
        // Convert StringBuilder to String and trim any extra space at the end
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();  // Close the scanner to prevent resource leak

        String capitalizedSentence = capitalword(sentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
}
