import java.util.Scanner;

public class Countvowels {
    static int vowels(String word){
        // String[] s=word.split(" ");
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(vowels(word));
    }
}