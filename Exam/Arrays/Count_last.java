// Length of last word
import java.util.*;
public class Count_last {
    static int Lastword(String s){
        int n=s.length()-1;
        int length=0;

        while (n>=0 && s.charAt(n)==' ') {
            n--;
        }
        while (n>=0 && s.charAt(n)!=' ') {
            length++;
            n--;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println("Length of last word : "+Lastword(s));
    }
}
