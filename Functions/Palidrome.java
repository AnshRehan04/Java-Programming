// WAP to check wheather a number is palidrome or not. 
import java.util.*;
public class Palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n=sc.nextInt();

        if(palidrome(n)){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Palidrome");
        }

    }
    public static int reverse(int n){
        int rev=0;
        while (n!=0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
    public static boolean palidrome(int n){

        if(reverse(n)==n){
            return true;
        }
        else{
            return false;
        }
    }
}
