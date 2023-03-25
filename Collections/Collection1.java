// package Collections;

import java.util.*;
public class Collection1 {
    public static void main(String[] args) {
        
        List<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        // List<String> l3 = new LinkedList();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        // l1.add("java"); - invalid
        // l1.add(34.677); - invalid
        System.out.println(l1);

        ArrayList<Double> l5 = new ArrayList<Double>();
        l5.add(10.0);
        l5.add(20.0);
        Integer a = Integer.valueOf(56);
        // l5.add(a); - invalid
        System.out.println(l5);

        // ArrayList<int>l6 = new ArrayList<int>(); - invalid


        Vector<String> v = new Vector<String>();
        v.add("java");
        v.add("c++");
        v.add("c");
        v.add("Python");

        System.out.println(v);

        Stack<String> stack = new Stack<String>();
        stack.add("java");
        stack.push("c++");

        System.out.println(stack);

        Iterator it = l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // 1 3 4 6 



    }
}
