// Print first non-repeated character in a sentence.

import java.util.Scanner;
public class Notunique {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sentence=sc.nextLine();
        for(int i=0;i<sentence.length();i++){
            boolean unique=true;
            for(int j=0;j<sentence.length();j++){
                if(i!=j && sentence.charAt(i)==sentence.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.print(sentence.charAt(i));
                break;
            }
        }
    }
}
