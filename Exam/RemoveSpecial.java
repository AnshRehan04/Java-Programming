import java.util.Scanner;
public class RemoveSpecial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence=sc.nextLine();
        String word=sentence.replaceAll("[^A-Za-z0-9]", " ");
        System.out.print(word);
    }
}
