import java.util.*;
public class ReverseEachWord {
    static String reverseEachword(String word){
        String[] sentence=word.split(" ");
        StringBuilder rev=new StringBuilder();
        for(String a:sentence){
            rev.append(new StringBuilder(a).reverse().toString());
            rev.append(" ");
        }
        return String.join(" ", rev);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        System.out.println(reverseEachword(word));
    }
}
