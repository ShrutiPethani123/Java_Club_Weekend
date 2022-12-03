/*
 * 

 many forms

 Type of polymorphism
 1. Compile time  (static polymorphism / Early Binding)
    -> Method Overloading

        -> changing number of argument
        -> changing the data type of argument

 2. Run time  ( Dynamic polymorphism / Late Binding)
    -> Method Overriding
 */

 class A{

    void add()
    {
        System.out.println("No argument function");
    }

    void add(int x,int y)
    {
        System.out.println("Addtion of 2 int arg: "+ (x+y));
    }

    void add(int x,int y,int z)
    {
        System.out.println("Addtion of 3 int arg: "+ (x+y+z));
    }

    void add(float a,float b)
    {
        System.out.println("Addtion of two float arg: "+ (a+b));
    }

    // int add()
    // {
                    // invalid
    // }
 }


public class Polymorphism {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.add(2,3);
        obj.add(2.3f,5.6F);
        obj.add(2,3,4);
        obj.add(2,4);
    }
    
}
