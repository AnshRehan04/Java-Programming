abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Creating a Animal ");
    }
    void eats(){
        System.out.println("Animal eats");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("Creating a Horse ");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        // horse.walk();
        // horse.eats();

        // Chicken chicken=new Chicken();
        // chicken.walk();
    }
}
