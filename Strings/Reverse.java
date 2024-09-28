// import java.util.Scanner;
// public class Reverse {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         StringBuilder name=new StringBuilder(str);

//         for(int i=0;i<name.length()/2;i++){
//             int front=i;
//             int end=name.length()-1-i;

//             char frontchar=name.charAt(front);
//             char endchar=name.charAt(end);

//             name.setCharAt(front, endchar);
//             name.setCharAt(end, frontchar);
//         }
//         System.out.println("Reverse of word : "+name);
//     }
// }


import java.util.*;
public class Reverse {
    static void ReverseWord(String word){
        StringBuilder rev=new StringBuilder(word);

        System.out.println("Reverse is "+rev.reverse());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        
        
        ReverseWord( word);
    }
}