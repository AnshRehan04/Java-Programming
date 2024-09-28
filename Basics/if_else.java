import java.util.*;
public class if_else {
    public static void main(String[] args) {
        System.out.println("Enter your age ");
        int age;
        Scanner sc=new Scanner(System.in);

        age=sc.nextInt();
        if(age>=18){
            System.out.println("You can Vote!!");
        }
        else{
            System.out.println("You Can't Vote!!");
        }
    }
}
