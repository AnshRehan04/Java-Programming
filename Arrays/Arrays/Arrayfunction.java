import java.util.*;
public class Arrayfunction {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void change(int[] arr){
        arr[0]=33;
    }
}
