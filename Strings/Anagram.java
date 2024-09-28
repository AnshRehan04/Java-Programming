import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String str1,String str2){


        char[] chararr1=str1.toCharArray();
        char[] chararr2=str2.toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);

        return Arrays.equals(chararr1,chararr2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first String :");
        String str1=sc.nextLine();
        System.out.print("Enter Second String :");
        String str2=sc.nextLine();
        
        if(isAnagram(str1,str2)){
            System.out.print("Anagram ");
        }
        else {
            System.out.print("Not Anagram ");
        }

    }
}
