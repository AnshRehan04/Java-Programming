import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password ");
        String pwd=sc.nextLine();

        if(pwd.length()<6){
            System.out.println("Too Short!");
        }
        else if (!pwd.matches(".*\\d")) {
            System.out.print("No Digit!");
        }
        else{
            System.out.print("Correct");
        }
    }
}
