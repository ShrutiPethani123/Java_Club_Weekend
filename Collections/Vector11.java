import java.util.*;


public class Vector11{
    public static void main(String[] args) {
        
        Vector<String> v = new Vector<>();
        v.add("India");
        v.add("canada");
        v.add("china");
        v.add("UK");
        v.add("Usa");
        System.out.println(v);
        v.addElement("Nepal");
        v.add("Italy");
        System.out.println(v);

        Vector<String> v1 = new Vector<>();
        v1.add("delhi");
        v1.add("Mumbai");
        v1.add("Ahm");

        v.addAll(v1);
        System.out.println(v);

        // v.clear();
        // System.out.println(v);

        System.out.println(v.contains("Usa"));
        System.out.println(v.contains("UsA"));

        System.out.println(v.containsAll(v1));
        v.remove("delhi");
        System.out.println(v);
        System.out.println(v.containsAll(v1));

        String a[]=new String[20];
        v.copyInto(a);
        for(String s: a)
        {
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println(v.size());

        System.out.println(v.get(2));
        System.out.println(v.firstElement());
        // v.forEach(System.out::println);
        System.out.println(v.indexOf("Mumbai"));
        System.out.println(v.indexOf("dsg"));
        v.insertElementAt("Baroda", 3);
        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.lastElement());
        System.out.println(v.firstElement());
        
        
    }
}