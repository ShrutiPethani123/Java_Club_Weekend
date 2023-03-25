import java.util.*;
import java.util.Iterator;

public class ArrayList11 extends ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList a = new ArrayList();

        list.add(2);
        list.add(5);
        list.add(4);
        list.add(45);
        list.add(23);
        list.add(78);
        // list.add("C"); - error

        // a.add(4);
        // a.add("java");
        // a.add(4.5);
         // System.out.println(a);

        //1. 
        System.out.println(list);

       
        //2.
        // Iterator itr = list.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        //3.
        // for(int i : list)
        // {
        //     System.out.println(i);
        // } 


        // get
        System.out.println(list.get(2));
        // System.out.println(list.get(30));

        // set
        list.set(2,67);
        System.out.println(list);

        //add
        list.add(1000);
        System.out.println(list);

        list.add(2,500);
        System.out.println(list);

        ArrayList11 l2 = new ArrayList11();
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        System.out.println(l2);

        //addAll
        list.addAll(l2);
        System.out.println(list);

        list.addAll(3,l2);
        System.out.println(list);

        //clear
        // list.clear();
        // System.out.println(list);

        // isEmpty()
        System.out.println(list.isEmpty());

        //indexOf
        System.out.println(list.indexOf(6));

        //lastIndexOf
        System.out.println(list.lastIndexOf(6));

        //
        System.out.println(list.contains(78));
        System.out.println(list.contains(242));

        System.out.println("Removed element: " + list.remove(3));
        System.out.println(list.remove(Integer.valueOf(45)));// return true
        // System.out.println(list.remove(100));
        System.out.println(list.remove(Integer.valueOf(56))); // return false
        // System.out.println(list.removeAll(l2));
        System.out.println(list.remove(Integer.valueOf(5)));
        
        System.out.println(list);

        System.out.println(l2);
        l2.removeRange(1,4);//1 2 3
        System.out.println(l2);

        System.out.println(l2.size());

        Collections.sort(list);
        System.out.println(list);       

        
        // ArrayList<int> list = new ArrayList<int>(); 

    }  
}

/*

Make one class Student and create arraylist of students objects
ans add 3 students in arraylist.

Student{
    int rollno;
    int age
    String name
    String address

    //setter

    void setRollNumber(int rollno){
        this.rollno = rollno;
    }

    //getter

    int getRollNumber()
    {
        return this.rollno;
    }

}



 */
