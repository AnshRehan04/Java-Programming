import java.util.*;
public class Largest_subsequence {
    static int largestsubsquence(String s){
        int ans=1;
        int temp=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                temp++;
            }
            else{
                ans=Math.max(ans, temp);
                temp=1;
            }
        }
        ans=Math.max(ans, temp);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(largestsubsquence(s));
    }
}
