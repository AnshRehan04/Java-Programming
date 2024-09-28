import java.util.*;
public class map_basics {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("ind", "India");
        map.put("in", "India");
        map.put("br", "Brazil");  //key should be unique values corresponding to them can be same but key shiuld be different.


        // To remove the element we use remove(key).
        // map.remove("in");
        // System.out.println(map);

        // // To check wheather particular key is present or not.
        // System.out.println("Key is present : "+map.containsKey("in"));
        // map.put("ind", "India1");
        // System.out.println(map);

        // // To get the values corresponing to particular keys
        // System.out.println(map.get("ind"));

        // // If no value is present or no key is there it return null
        // System.out.println(map.get("pn"));

        // // To check wheather particular value is present in the hashmap
        // System.out.println("Value is present : "+map.containsValue("India1"));

        Set<String> keys= map.keySet();

        System.out.println(keys);

    }
}
