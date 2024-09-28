import java.util.Scanner;

public class Capitalise {
    static String CapitaliseFirst(String s){
        String[] word=s.split(" ");
        for(int i=0;i<word.length;i++){
            word[i]=word[i].substring(0,1).toUpperCase()+word[i].substring(1);
        }
        return String.join(" ",word);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(CapitaliseFirst(s));
    }
}
