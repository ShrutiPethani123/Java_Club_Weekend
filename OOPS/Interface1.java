/*

Interface --> 
-> By default all method of interface is public and abstract
-> By default variables are public static final

I
| implements
C

C
| extends
C

I
| extends
I


C
|  --> invalid
I


 */

interface A{

    int a=4;
    // A()
    // {
                // not possible
    // }

    void display();
    abstract void msg();
} 

interface C extends A{

    void print();
   
}

class B implements C{

    public void display()
    {
        System.out.println("Display method");
    }

    public void msg()
    {
        System.out.println("msg method");
    }

    public void print()
    {
        System.out.println("Print Method");
    }
}

public class Interface1 {
    
    public static void main(String[] args) {
        // A obj = new A();
        B obj = new B();
        obj.display();
        obj.msg();
    }
}


