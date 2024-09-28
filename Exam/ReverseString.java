import java.util.Scanner;

public class ReverseString {
    static String Reversestring(String word){
        StringBuilder str=new StringBuilder(word);

        return str.reverse().toString();
    }
    static boolean Palidrome(String word){
        if(Reversestring(word).equals(word)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String word=sc.nextLine();
        System.out.println("Reverse is "+Reversestring(word));
        if(Palidrome(word)){
            System.out.print("Palidrome ");
        }
        else{
            System.out.print("Not Palidrome");
        }
    }
}
