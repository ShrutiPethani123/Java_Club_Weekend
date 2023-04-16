import java.util.*;

public class HashMap11 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "India");
        map.put(2,"USA");
        map.put(3,"Canada");
        map.put(4,"UK");

        System.out.println(map);

        System.out.println(map.get(4));
        map.put(3,"China");

        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // map.remove(2);
        // System.out.println(map);
    
        // map.remove(4, "UK");
        System.out.println(map);
        // map.replace(2,"Italy");
        map.replace(2,"USE","Italy");
        System.out.println(map);

        
    }
}
