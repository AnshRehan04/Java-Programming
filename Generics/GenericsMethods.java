public class GenericsMethods {
    public static void main(String[] args) {
        printdata("Ansh");
        printdata(12);
    }
    static <E> void printdata(E data){
        System.out.println(data);
    }
}

