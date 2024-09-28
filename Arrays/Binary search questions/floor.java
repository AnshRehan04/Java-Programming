// Find the Floor of a number
// Return the index of the maximum number which is less than or equal to the target
// TC O(logn);
import java.util.Scanner;
public class floor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array ");
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key;
        System.out.println("Enter the key to search ");
        key=sc.nextInt();
        System.out.print("Element is found at ");
        System.out.println(binarysearch(arr, key));
    }
    static int binarysearch(int arr[],int key){
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
        
        while (s<=e) {
            if(arr[mid]<key){
                s=mid+1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else{
                e=mid-1;
            }
            mid=(s+e)/2;  
        }
        return e;
    }

}


