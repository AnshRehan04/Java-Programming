import java.util.*;
public class Happynumber {
    static int sumofsquares(int n){
        int sum=0;
        while (n>0) {
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return sum;
    }
    static boolean isHappy(int n){
        HashSet<Integer> num=new HashSet<>();
        while (n!=1 && !num.contains(1)) {;
            num.add(n);
            n=sumofsquares(n);
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (isHappy(n)) {
            System.out.println("Happy ");
        }
        else{
            System.out.println("Not Happy ");
        }
    }
}
