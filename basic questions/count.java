import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int cnt=0;
        int a;
        System.out.println("Enter the number ");
        a=sc.nextInt();
        while (n!=0) {
            int rem=n%10;
            if(rem==a){
                cnt++;
            }
            n=n/10;
        }
        System.out.println("Occurence is "+cnt);
    }
}