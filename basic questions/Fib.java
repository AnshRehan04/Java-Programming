import java.util.*;
public class Fib {
public static void main(String[] args) {
    int a=0;
    int b=1;

    Scanner sc=new Scanner(System.in);

    int count=0;
    int n=sc.nextInt();
   while (count<=n) {
    int temp=b;
    b=b+a;
    a=temp;
    count++;
   }
   System.out.println(b);
}

}
