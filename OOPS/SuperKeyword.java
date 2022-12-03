/*

-> whenever we make object of child class always first call parent class constructor.

 */

class A{

    int y=60;

    A()
    {
        System.out.println("I am class A default constructor..");
    }

    A(int x)
    {
        System.out.println("I am class A per. constructor..");
    }

    void disp()
    {
        System.out.println("hello");
    }


}

class B extends A{

    B()
    {
        System.out.println("I am class B default constructor..");
        
    }
    B(int x)
    {
        super(6);
        System.out.println("I am class B per. constructor..");
    }

    void setvalue(int b)
    {
        super.y=b;
        super.disp();
        disp();

    }

}

class C extends B{

    C()
    {
        super(5);
        System.out.println("I am class C default constructor..");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        
        // B obj = new B();
        // A a1 = new A();
        // A a2 = new A(5);
        C objc = new C();


    }
}
