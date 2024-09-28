import java.util.*;
public class CapitaliseWord {
    static String Capital(String sentence){
        String[] word=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            word[i]=word[i].substring(0,1).toUpperCase()+word[i].substring(1);
            sentence+=word[i];
        }
        return String.join(" ",word);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence=sc.nextLine();

        System.out.print(Capital(sentence));
    }
}
