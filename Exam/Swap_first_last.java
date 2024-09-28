import java.util.Scanner;

public class Swap_first_last {
    static String Swapwords(String s){
        String[] word=s.split(" ");
        for(int i=0;i<word.length;i++){
            int n=word[i].length();
            word[i]=word[i].substring(n-1)+word[i].substring(1,n-1)+word[i].substring(0,1);
        }
        return String.join(" ",word);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Swapwords(s));

    }
}
