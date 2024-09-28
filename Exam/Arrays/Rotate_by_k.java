// wap to rotate the array by k positions

import java.util.Scanner;

public class Rotate_by_k {
    static void RotateArray(int arr[],int k){
        if(k==0){
            return ;
        }
        int n=arr.length;
        int [] temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=0;i<)
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k=sc.nextInt();
        RotateArray(arr,k);
    }
}