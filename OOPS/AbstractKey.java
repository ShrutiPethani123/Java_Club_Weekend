/*
Abstract -  class , Method


-> we can't create object of abstract class.
-> abstract method does not have body.
-> we can't create abstract method in non abstract class
-> we can achive 0 to 100% abstarct class.

 */

abstract class A{

    void disp()
    {
        System.out.println("hello");
    }

    abstract void print();
    
}

class B extends A{

    void print()
    {
        
    }

}

class C extends A{
    void print()
    {

    }
}

public class AbstractKey {

    public static void main(String[] args) {

        // A obj = new A();
        B obj = new B();
        obj.disp();
        
    }
    
}
