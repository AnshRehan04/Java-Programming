import java.util.*;
public class MaximumProductSubarray {

    static int maxproduct(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=i;j<arr.length;j++){
                prod=prod*arr[j];
                maxi=Math.max(maxi,prod);
            }
        }
        
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Maximum subarray product is "+maxproduct(arr));
    }
}
