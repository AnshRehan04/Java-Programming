import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountAnagrams {
    static boolean isAnagram(String word1,String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] s1=word1.toCharArray();
        char[] s2=word2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
    static int countAnagrams(String word,String anagramword){
        String[] words = word.split("\\s+");
        int count=0;

        for(String sentence:words){
            if(isAnagram(sentence, anagramword)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Sentence ");
        String word=sc.nextLine();
        System.out.print("Enter Anagram : ");
        String anagramword=sc.nextLine();
        System.out.println("Count is "+countAnagrams(word, anagramword));
    }
}
