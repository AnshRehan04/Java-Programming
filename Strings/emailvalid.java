import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class emailvalid
{
  public static void main(String[] args)
  {
    String id;
    Scanner sc=new Scanner(System.in);
    id=sc.nextLine();
    if((id.indexOf('@')==-1)||(id.indexOf('.')==-1)||(id.indexOf('@')>id.indexOf('.')))
      System.out.println("Invalid");
      else
      System.out.println("Valid");
  }
}

