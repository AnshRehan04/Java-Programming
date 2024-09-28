import java.util.*;
public class Capitalizeword {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        String name=sc.nextLine();
        String[] sentence=name.split(" ");
        for(int i=0;i<sentence.length;i++){
            String firstletter=sentence[i].substring(0,1);
            String remainingletter=sentence[i].substring(1);

            firstletter=firstletter.toUpperCase();
            sentence[i]=firstletter+remainingletter;
        }
        String completed=String.join(" ",sentence);
        System.out.print("The Sentence is "+completed);
    }
}