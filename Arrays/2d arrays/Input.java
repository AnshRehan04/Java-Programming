import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        int row=sc.nextInt();
        System.out.println("Enter the no of columns ");
        int cols=sc.nextInt();

        int [][] arr= new int[row][cols];

        System.out.println("Input ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        } 

        System.out.println("Output");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
