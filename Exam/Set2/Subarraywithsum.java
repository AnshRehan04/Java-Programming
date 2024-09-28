import java.util.Scanner;

public class Subarraywithsum {
    static void findSubarray(int arr[], int target) {
        int n = arr.length;
        int currSum;
        for (int i = 0; i < n; i++) {
            currSum = arr[i];  
            for (int j = i + 1; j <= n; j++) {
                if (currSum == target) {
                    System.out.println("Subarray found from index " + i + " to " + (j - 1));
                    return;
                }
                if (j < n) {
                    currSum += arr[j]; 
                }
            }
        }
        System.out.println("No subarray with the given sum was found.");
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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findSubarray(arr, target);
        
    }
}
