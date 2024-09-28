import java.util.Scanner;

public class CountPalidrome {
    static int countpalidrome(String word){
        int count=0;
        String[] str=word.split(" ");
        for(int i=0;i<str.length;i++){
            String args=str[i].toLowerCase();
            StringBuilder st=new StringBuilder(args);
            String rev=st.reverse().toString();
            if(args.equals(rev)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String word=sc.nextLine();
        System.out.print("Count is "+countpalidrome(word));
    }
}
