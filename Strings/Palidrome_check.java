// This will check the no of palidrom in a sentence.
import java.util.Scanner;
public class Palidrome_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] st=str.split(" ");
        int count=0;
        for(int i=0;i<st.length;i++){
        String s=st[i].toLowerCase();
        StringBuilder word=new StringBuilder(s);
        String reverseword=word.reverse().toString();
        if(s.equals(reverseword)){
            count++;
        }
        }
        
        System.out.println(count);
    }
}
