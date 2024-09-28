// Time complexity O(logn)
import java.util.Scanner;
public class Singleelment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array ");
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Single Element is "+singleelement(arr));
    }
    static int singleelement(int[] arr){
        int n=arr.length;
        if(n==1) return arr[0];  //if only there is one element
        if(arr[0]!=arr[1]) return arr[0] ; // first element is single element.
        if(arr[n-1] !=arr[n-2]) return arr[n-1]; //last element is single element.

        int s=0;
        int e=n-1;
        while (s<=e) {
            int mid=(s+e)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){ // if element is at middle and its single.
                return arr[mid];
            }
            // We are at left half
            if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                // Eliminate left part.
                s=mid+1;
            }
            else{
                // Eliminate right half.
                e=mid-1;
            }
        }
        return -1;
    }
}
