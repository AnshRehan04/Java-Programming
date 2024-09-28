import java.util.*;
public class permutations {
    static void printpermutation(String str1,String str2){
        if(str1.length()==0){
            System.out.print(str2+" ");
            return;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);

            String str3=str1.substring(0, i)+str1.substring(i+1);
            printpermutation(str3, str2+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        printpermutation(str, "");

    }
}