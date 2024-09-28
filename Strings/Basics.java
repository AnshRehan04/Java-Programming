public class Basics{
    public static void main(String[] args) {
        // String a="Hello";
        // System.out.println(a);
        // a="World!";
        // System.out.println(a);

        String a="Hello";
        String b="Hello";
        // Both are reference to same variable in String pool.
        //To check we use comparison between both of them. ==(checks for both the values and reference variablex)
        System.out.println(a==b);

        // Another way of initialsing the 2 variable with same content pointing to different refernce in heap outside pool.
        // By using new keyword

        String c=new String("Hello");
        String d=new String("Hello");

        System.out.println(c==d);//Return False It refers to different object into the heap outside pool.
        

        // When you only wants to check the value use equal(=) method.

        System.out.println(c.equals(d));  //Return True, because it checks wheather bith c and d have equal values it doesn't care about the refernece

        System.out.println(a.charAt(0));  //H


        // String Methods
        String e="Tony Stark";
        System.out.println(e.substring(0,4)); //Tony
        System.out.println(e.indexOf("T")); //0 return index of particular character.

        
        // String builder
        // They are same as String Just it is mutable.
        StringBuilder sb=new StringBuilder("Tony"); 
        System.out.println(sb); //Tony

        // sb.setCharAt(0, 'S');  //This method is used to replace particular index character with our desired character.
        // System.out.println(sb);  //Sony

        sb.insert(0, 'S'); //It add the particular character at particular index.
        System.out.println(sb);

        //If we want to delete some character from the string we can use delete method
        sb.delete(0, 3);
        System.out.println("Delete method :"+sb); //ny

        // append : It is used to append the character at the last of the sentence.

        StringBuilder temp=new StringBuilder("Ansh rehan");

        temp.append(" is good");
        System.out.println("Appended string : "+ temp);

        // .length() : to print the length of the string
        System.out.println("Length of the string : "+temp.length()); //18

        
    }
}