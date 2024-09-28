import java.util.*;
public class PasswordValidation {

    static void Passwordcheck(String pwd){
        if(pwd.length()<6){
            System.out.print("Too Short");;
        }
        else if(!pwd.matches(".*\\d")){
            System.out.print("No Digit!");
        }
        else {
            System.out.print("Correct!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username : ");
        String uname=sc.nextLine();
        System.out.print("Enter Password : ");
        String pwd=sc.nextLine();
        
        Passwordcheck(pwd);
    }
}