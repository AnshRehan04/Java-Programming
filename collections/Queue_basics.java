import java.util.*;
public class Queue_basics {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(40);

        // System.out.println("Queue : "+que);
        // System.out.println("Polled element : "+que.poll()); //poll() is used to remove the element from the queue from the froht side.
        // System.out.println("After Polling : "+que);

        // System.out.println("Next element to be removed "+que.peek());  //peek() is used to check which element will remove the after the first element is removed.
        // System.out.println(que.poll());
        // System.out.println(que);

        // To print the all elements to removed.
        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
        // System.out.println(que.poll()); //return null
        // System.out.println(que.remove());  //Throws exception/


    }
}
