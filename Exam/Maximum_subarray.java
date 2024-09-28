import java.util.*;
public class Maximum_subarray {

    static int maxarray(int arr[],int k){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];

            if(i>=k){
                currSum=currSum-arr[i-k];
            }
            if(i>=k-1){
                maxSum=Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k : ");
        int k=sc.nextInt();
        System.out.println("Max subarray is : "+maxarray(arr,k));
    }
}
