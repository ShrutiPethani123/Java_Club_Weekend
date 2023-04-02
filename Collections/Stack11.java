import java.util.*;
public class Stack11 {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(23);
        s.push(40);
        s.push(35);
        s.push(55);
        System.out.println(s);

        // System.out.println(s.pop());
        // s.pop();
        // System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s.search((23)));

        //push , pop , peek , empty , search

    }
}
