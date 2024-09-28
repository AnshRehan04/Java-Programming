import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reversearray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reversearray(int arr[]){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            swap(arr,s,e);
                s++;
                e--;
        }
    }
    static void swap(int []arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
