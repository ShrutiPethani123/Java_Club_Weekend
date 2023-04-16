import java.util.*;
public class PriorityQueue11 {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(23);
        queue.add(46);
        queue.add(23);
        queue.add(16);
        queue.add(78);
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

       


    }
}
