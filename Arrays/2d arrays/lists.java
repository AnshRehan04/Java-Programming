import java.util.*;
// import java.util.ArrayList;
public class lists {
    public static void main(String[] args) {

        // ArrayList are like vector in c++.
        ArrayList <Integer> list=new ArrayList<Integer> (10);

        /*
        list.add(67);
        list.add(43);
        list.add(432);
        list.add(41);
        list.add(67);
        list.add(43);
        System.out.println(list.contains(54));//Checks wheather 54 is in the list 
        System.out.println(list); //Print out the list.
        list.set(0, 32);//change the element at index 0 with 32.
        System.out.println(list);

        list.remove(2);//Removes the element at index 2.
        System.out.println(list);

         */

         //user input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}
