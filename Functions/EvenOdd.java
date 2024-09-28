import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number ");
        n=sc.nextInt();
        if(check(n)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static boolean check(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
} 