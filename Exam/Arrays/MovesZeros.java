import java.util.*;
public class MovesZeros {
    static void MoveZeroes(int arr[]){
        int n=arr.length;
        int idx=0;

        
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
                
            }
        }
        for(int i=idx;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        MoveZeroes(arr);


    }
}
