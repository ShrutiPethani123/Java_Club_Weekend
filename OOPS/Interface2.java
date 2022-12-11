/*

use of interface
1. 100 % abstraction
2. achive multiple inheritance

c   c
\   /
  c    -> not possible


I   I
\  / implements
 C

I   I
\   / extends
  I

 */
interface Parent1{

    void car();
    void bike();

}

interface Parent2{

    void car();
    void activa();

}

class Child implements Parent1 , Parent2{

    public void car()
    {
        System.out.println("Car");
    }

    public void activa()
    {
        System.out.println("Active");
    }

    public void bike()
    {
        System.out.println("Bike");
    }

}

public class Interface2 {

    public static void main(String[] args) {
        
        Child obj = new Child();
        obj.car();
        obj.activa();
        obj.bike();
    }
    
}
