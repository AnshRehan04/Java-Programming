// public class generics_basics {
//     public static void main(String[] args) {
//         Dog<String,String> d1=new Dog<>("123","Ansh");
//         Dog<Integer,String> d2=new Dog<>(12,"Vansh");

//         d1.show();
//         d2.show();
//     }
// }
// class Dog <E,V>{
//     E id;
//     V name;

//     Dog(E id,V name){
//         this.id=id;
//         this.name=name;
//     }
//     public void show(){
//         System.out.println(id);
//         System.out.println(name);
//     }
// }


public class generics_basics {

    public static void main(String[] args) {
        // int a=2/0;
        int [] a={1,2};
        System.out.println(a[3]);
    }
}