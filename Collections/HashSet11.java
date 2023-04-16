import java.util.*;
public class HashSet11 {
    public static void main(String[] args) {
        
        HashSet<String>  set = new HashSet<>();
        set.add("rohan");
        set.add("Priyansh");
        set.add("parshwa");
        set.add("joy");
        System.out.println(set);

        // for (String s : set) {
        //     System.out.println(s);
        // }
        set.add("joy");
        set.add("ram");
        set.add("Priyansh");

        Iterator<String> i = set.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+ " ");
        }
        System.out.println();

        set.remove("joy");
        System.out.println(set);

        HashSet<String>set2 = new HashSet<>();
        set2.add("khush");
        set2.add("nihar");

        set.addAll(set2);
        System.out.println(set);
        set.removeAll(set2);
        System.out.println(set);

        // set.removeIf(t ->t.contains("ram"));
        set.removeIf(t ->t.contains("sh"));
        set.clear();

        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(56);
        list.add(10);
        list.add(12);
        list.add(45);
        System.out.println(list);

        HashSet<Integer>newSet = new HashSet<>(list);
        System.out.println(newSet);

        System.out.println(newSet.size());
    }
}
