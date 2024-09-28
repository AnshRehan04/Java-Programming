import java.util.ArrayList;
import java.util.*;
public class Lists{
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        ans.add(12);
        ans.add(14);
        ans.add(1);
        // System.out.print("Before removing : ");
        // System.out.println(ans);

        // System.out.print("Size of list : ");
        // System.out.println(ans.size());

        // ans.remove(1);
        // System.out.print("After Removing : ");
        // System.out.println(ans);

        // System.out.print("It contains : ");
        // System.out.print(ans.contains(12));

        Scanner sc=new Scanner(System.in);
        list2.add(12);
        list2.add(13);
        list2.add(113);


        ans.addAll(list2);
        System.out.println(ans);

        // ans.removeAll(list2);
        // System.out.print("After removing :");
        // System.out.println(ans);

        // System.out.print("Intersection of lists :");
        // ans.retainAll(list2);
        // System.out.println(ans);

        // To get the element at particular index.
        System.out.println(ans.get(1));

        // To set/change the particular index with some element .
        System.out.println("After setting ");
        ans.set(1, sc.nextInt());
        System.out.println(ans);
    }
    
}