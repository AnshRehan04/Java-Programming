import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter first number :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter second number :");
        b=sc.nextInt();
        System.out.println("Enter third number :");
        c=sc.nextInt();

        if(a>b && b>c){
            System.out.println("A is greater ");
        }
        else if(b>a && b>c){
            System.out.println("B is greater ");
        }
        else{
            System.out.println("C is greater ");
        }
    }
}