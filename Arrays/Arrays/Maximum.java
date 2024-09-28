import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        int arr[]={12,3,454,6};
        System.out.println("Max is "+getmax(arr));
    }    
    public static int getmax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
