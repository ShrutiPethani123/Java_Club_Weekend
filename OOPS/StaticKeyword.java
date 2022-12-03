
/*

static - variables , Method , class , block

-> for static variable same memory allocation for all objects.
-> we can't use non static variable in static method.
-> We not need to make object for calling static type method or variable.
-> we can't make outer class as static but we can make inner class as static.

 */

class A{

    int x;
    static int y;

    static class B{

    }

    A()
    {
        System.out.println("x= " + ++x);
        System.out.println("y= "+ ++y);
    }

    static void display()
    {
        System.out.println("value of Y : "+ y);
        // System.out.println("value of x"+ x); - we can't use non static variable in static method

    }

    void disp2()
    {
        System.out.println("value of Y : "+ y);
        System.out.println("value of x"+ x);
    }


    {
        System.out.println("Instance block called....");
        // instance block
    }

    static{
        System.out.println("Static block called...");

        // static block
    }
}



public class StaticKeyword {

    int a=56;
    static int c=100;
    public static void main(String[] args) {
        
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4=new A();

        // System.out.println(a1.y);
        // System.out.println(a2.y);
        // System.out.println(a3.y);
        // System.out.println(a4.y);

        System.out.println(A.y);
        // a2.display();
        A.display();

        System.out.println(a);
        System.out.println(c);

    }
    
}
