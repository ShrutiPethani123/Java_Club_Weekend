
import java.util.*;
public class LinkedList11 {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(3);
        ll.add(6);
        ll.add(7);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(52);
        l2.add(9);
        l2.add(53);
        l2.add(48);
        // ll.addAll(l2);
        ll.addAll(2,l2);
        System.out.println(ll);

        ll.addFirst(100);
        ll.add(4,200);
        System.out.println(ll);

        ll.addLast(200);
        System.out.println(ll);

        System.out.println(ll.contains(500));
        System.out.println(ll.contains(50));

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(3));


        System.out.println(ll.indexOf(200));
        System.out.println(ll.lastIndexOf(200));

        System.out.println(ll.offerFirst(30));
        System.out.println(ll.offerLast(70));
        System.out.println(ll.offer(45));

        System.out.println(ll);
        System.out.println(ll.remove(5));
        System.out.println(ll.remove());
        System.out.println(ll.remove(Integer.valueOf(200)));
        System.out.println(ll.removeLast());
        System.out.println(ll);



    }
}

/*

Make one list of Employees that contains Employee name , id , address , salary , designation.

 */