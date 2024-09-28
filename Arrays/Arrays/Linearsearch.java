import java.util.*;
public class Linearsearch{
    public static void main(String[] args) {
        int[] arr={12,33,2,1,23,4,56,7};
        if (ispresent(arr, 323)) {
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present ");
        }
        
    }
    public static boolean ispresent(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}