import java.util.*;
public class occurence {

    static void findoccurence(String word,String ch){
        int cnt=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                cnt++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word=sc.nextLine();

        String ch=sc.nextLine();
        findoccurence(word,ch);
    }
}
