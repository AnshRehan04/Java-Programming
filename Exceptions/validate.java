import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void validateEmail(String str) throws Exception{
    if(!str.contains("@")){
      throw new Exception("Email does not contains @");
    }
    if(!str.contains(".")){
      throw new Exception("Email does not contains .");
    }
    int at = str.indexOf("@");
    String afterAt = str.substring(at+1);
    if(!afterAt.contains(".")){
      throw new Exception("No . appears after @");
    }
  }
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    try{
      validateEmail(id);
      System.out.println("Valid");
    }catch(Exception e){
      System.out.println("Invalid");
    }
  }
}