import java.util.Scanner;
public class Upperbound {
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
        System.out.println(upperbound(arr, key));
    }
    static int upperbound(int [] arr,int key){
        int s=0;
        int e=arr.length-1;
        int ans=arr.length;

        while (s<=e) {
            int mid=s+(e-s)/2;
            if (arr[mid]>key) {
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
