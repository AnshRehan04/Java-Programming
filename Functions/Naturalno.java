import java.util.*;
public class Naturalno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number ");
        n=sc.nextInt();

        System.out.println("Sum of natural no "+natural(n));

    }
    public static int natural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
