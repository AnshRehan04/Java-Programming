import java.util.*;
public class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email id : ");
        String id=sc.nextLine();

        if((id.indexOf("@")==-1) ||( id.indexOf(".")==-1 ) || (id.indexOf("@")>id.indexOf("."))){
            System.out.print("Invalid!");
        }
        else{
            System.out.print("Valid!");
        }
    }
}
