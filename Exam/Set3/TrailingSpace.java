import java.util.Scanner;

public class TrailingSpace {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        System.out.println(word.trim());
    }
}
