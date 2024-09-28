public class Person_student {
    class Person{
        String name;
        int age;

        Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }

        public void displayDetails(){
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        }
    }
    class Student extends Person{
        int rno;
        double marks;

        Student(String name,int age,int rno,double marks){
            super(name, age);
            this.rno=rno;
            this.marks=marks;
        }

        // Set marks
        public void setmarks(double marks){
            this.marks=marks;
        }

        // Set rno
        public void setrno(int rno){
            this.rno=rno;
        }
        public int getrno(){
            return rno;
        }
        public double getmarks(){
            return marks;
        }
        @Override
        public void displayDetails(){
            super.displayDetails();
            System.out.println("Marks : "+marks);
            System.out.println("Roll no : "+rno);
        }

        public String displayMarks(){
            if(marks>90){
                return "A";
            }
            else if(marks>80 && marks<89){
                return "B";
            }
            else if(marks>70 && marks<79){
                return "C";
            }
            else if(marks>60 && marks<69){
                return "D";
            }
            else{
                return "F";
            }
        }
    }
    public static void main(String[] args) {

         // Create an instance of the outer class
         Person_student outerInstance = new Person_student();
        
         // Create an instance of the inner class Student
         Person_student.Student student = outerInstance.new Student("Ansh", 20, 1299, 85.5);

        student.displayDetails();
        student.displayMarks();
    }
}
