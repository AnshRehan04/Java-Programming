import java.util.*;
public class Swap_firstLast {
    static String SwapSentence(String sentence){
        String[] word=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            int n=word[i].length();
            word[i]=word[i].substring(n-1)+word[i].substring(1,n-1)+word[i].substring(0,1);
        }
        return String.join(" ",word);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String sentence=sc.nextLine();

        System.out.print(SwapSentence(sentence));
    }
}

