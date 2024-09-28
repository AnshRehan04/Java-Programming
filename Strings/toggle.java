// import java.util.*;
// public class toggle {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         StringBuilder str=new StringBuilder(sc.nextLine());  //Take string input

//         // Toggle the string
//         // PhYsicS --->pHySICs.


//         for(int i=0;i<str.length();i++){
//             // Suppose char is capital
//             boolean flag=true ;  //letter->Captial

            
//             char ch=str.charAt(i);//A
//             int asci=(int)ch;  //65
//             if(ch==' '){
//                 continue;
//             }
//             if(asci>=97) flag=false; //letter ->small

//             if(flag==true){//Letter is capital change it to small
//                 asci+=32;
//                 char ltr=(char)asci; //a
//                 str.setCharAt(i, ltr);
//             }
//             else{
//                 asci-=32;
//                 char ltr=(char)asci;
//                 str.setCharAt(i, ltr);
//             }
//         }
//         System.out.println(str);
//     }
// }


import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                char lowercase=(char)(ch+32);
                str.setCharAt(i, lowercase);
            }
            else if(ch>='a' && ch<='z'){
                char uppercase=(char) (ch-32);
                str.setCharAt(i,uppercase);
            }
        }
        System.out.println(str);
    }
}