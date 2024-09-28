import java.util.*;
public class List_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of elements ");
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.print("Enter each element ");
            // int m=s;
            list.add(sc.nextInt());
        }
        System.out.println(list); 
        System.out.println("Index of particular element : "+list.indexOf(20));

        // To print the last ooccurenece of particular elements
        System.out.println("Last index of that element : "+list.lastIndexOf(2));
    }
}