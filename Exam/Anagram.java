import java.util.*;
public class Anagram {
    static boolean AnagramCheck(String word1,String word2){

        char[] s1=word1.toCharArray();
        char[] s2=word2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String word1=sc.nextLine();
        System.out.print("Enter the sentence : ");
        String word2=sc.nextLine();
        
        if(AnagramCheck(word1,word2)){
            System.out.print("Anagrams");
        }
        else{
            System.out.print("Not Anagram");
        }


    }
}
