public class Type_conversion {
    public static void main(String[] args) {
        int num=(int) (20.45f);  //It will automatically converts the float value into number
        // It is called as typecasting

        // System.out.println("Marks is "+num); 

        int a=257;
        byte b=(byte)(a);
        System.out.println(b);  //Print out 1---> 257 % 256=1
    }
}
