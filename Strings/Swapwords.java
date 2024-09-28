import java.util.Scanner;

public class Swapwords {

    static String swapwords(String word){
    

        // if(word.length()<2){
        //     return word;  
        // }
        char[] ch=word.toCharArray();

        char temp=ch[0];
        ch[0]=ch[ch.length-1];
        ch[ch.length-1]=temp;

        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word=sc.nextLine();

        System.out.print(swapwords(word));
    }
}
