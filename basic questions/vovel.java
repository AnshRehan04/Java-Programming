import java.util.*;
public class vovel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string :");
        String a=sc.nextLine();

        int vowelcount=0;
        for(char ch:a.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vowelcount++;
            }
        }
        
        System.out.println("Vowel count is "+vowelcount);
    }
}