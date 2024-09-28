import java.util.*;
public class forloop{
    public static void main(String[] args) {
        // int a=5;
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}