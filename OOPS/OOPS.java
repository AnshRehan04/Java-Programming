class pen {
    String color;
    String type;
    void write(){
        System.out.println("Pen is writing");
    }
    public void printColor(){
        System.out.println("The color of the pen is "+this.color);
    }
    
}
class Student{
    int rno;
    String name;

    public void printinfo(String name,int rno){
        System.out.println("Name of student is "+this.name+" Roll no is "+this.rno);
    }

    public void printinfo(String name){
        System.out.println("Name of student is "+name);
    }

    public void printinfo(int rno){
        System.out.println("Roll no of student is "+rno);
    }




    // Student(){
    //     System.out.println("Constructor called "); //Non parameterised constuctor
    // }

    // Student(int rno,String name){
    //     this.rno=rno;
    //     this.name=name;  //Parameterised constructor
    // }

    // Student(Student s2){
    //     this.name=s2.name;
    //     this.rno=s2.rno;
    // }
}
public class OOPS {
    public static void main(String[] args) {
        // pen pen1=new pen();
        // pen1.color="red";
        // pen1.type="ballpoint";
        // pen1.write();
        // pen1.printColor();

        // pen pen2=new pen();
        // pen2.color="black";
        // pen2.type="gel";
        // pen2.printColor();

        // Student st1=new Student(12,"Ansh Rehan");
        // st1.name="Ansh";
        // st1.printinfo();

        // Student st1=new Student();
        // st1.name="ansh";
        // st1.rno=24;
        // Student s2=new Student(st1);
        // st1.printinfo();

        Student st1=new Student();
        st1.printinfo(23);
        st1.printinfo("Ansh");
        st1.printinfo("Ansh", 23);

    }
}
