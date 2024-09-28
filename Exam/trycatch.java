public class trycatch {
    public static void main(String[] args) {
        try{
            int a=2/0;
            System.out.println("A");
        }
        catch(Exception e){
            System.out.println("B");
        }
        finally{
            System.out.println("C");
        }
    }
}
