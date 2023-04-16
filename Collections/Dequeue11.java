import java.util.*;

public class Dequeue11 {
    public static void main(String[] args) {
        Deque<Integer> deque= new ArrayDeque<Integer>() ;

        deque.add(12);
        deque.add(23);
        deque.add(45);
        deque.add(14);
        deque.add(156);

        System.out.println(deque);
        deque.offerFirst(45);
        System.out.println(deque);
        deque.offerLast(34);
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

        deque.poll(); // same as pollFirst
        System.out.println(deque);





            
        
    }
}
