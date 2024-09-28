import java.util.*;
public class Dequeue_basics {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<Integer>();

        // Deque is a type of queue where we can add elements from both ends.
        // dq.offer(10);
        // dq.offerFirst(20);
        // dq.offerLast(30);
        // System.out.println(dq);

        // Polled elements
        // System.out.println("First polled element : "+dq.poll());
        // System.out.println("Last polled element : "+dq.pollLast());


        // Using dq as stack data structure.

        dq.push(10);
        dq.push(20);
        dq.push(30);

        System.out.println(dq);  //Prints the first element that is inserted. [30,20,10]

        // For removing the element pop() method is used It removes the first element.

        System.out.println(dq.pop());
    }
}
