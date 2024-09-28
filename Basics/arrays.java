import java.util.*;
public class arrays{
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        int n;
        System.out.println("Enter the value of n ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
       
       for(int i = 0; i < n;i++){
        arr[i]=sc.nextInt();
       }

       System.out.println("The array is ");
    //    for(int i=0;i<n;i++){
    //     System.out.println(arr[i]+" ");
    //    }

    for(int i:arr){
        System.out.println(i+" ");
    }

        
    }
}