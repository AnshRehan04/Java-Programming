import java.util.*;
public class trycatch {

    public static void main(String[] args) {
        System.out.println("Hello");
        // int a[]=new int[5];
        try{
            // int b=5/0;
            // System.out.println(a[8]);
        
           
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array is out of bound");
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        //     System.out.println(e.toString());
        // }
        
        catch(Exception e){ //If we don't know the particular exception.
        System.out.println("Unknown Exception ");
        }
        System.out.println("Bye");
    }
}


// 0 divided by 0 after 