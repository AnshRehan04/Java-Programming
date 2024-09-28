import java.util.*;
public class set_basics {
    public static void main(String[] args) {
        // Set<Integer> st=new HashSet<>();
        Set<Integer> st=new LinkedHashSet<>();
        st.add(12);
        st.add(12);
        st.add(132);
        st.add(2); 
        System.out.println(st);
        st.remove(12);
        System.out.println("After removing "+st);
    }
}
