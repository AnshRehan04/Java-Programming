// Generics only works with class  
class Container <T>{
    T values;
    public void show(){
        System.out.println(values.getClass().getName());  //Will return the type of Container i.e Integer.
    }
}
public class Generics {
    
    public static void main(String[] args) {
        
        Container<Integer> array=new Container<Integer>();
        array.values=12;
        array.show();
    }

   
} 
