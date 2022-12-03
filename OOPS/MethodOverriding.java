/*

-> we can't override static method and instance variable.

 */

 class A{

    int x=100;
    int y=200;

    void print()
    {
        System.out.println("class A..");
    }

    void methodA()
    {
        System.out.println("class A Method...");
    } 

 }

 class B extends A{

    int x=500;
    int z=600;

    void print()
    {
        System.out.println("class B...");
    }

    void methodB()
    {
        System.out.println("class B Method...");
    } 

 }


public class MethodOverriding {

    public static void main(String[] args) {

        A objA = new A();
        objA.print();
        objA.methodA();
        // objA.methodB(); - invalid
        System.out.println(objA.x);
        System.out.println(objA.y);
        // System.out.println(objA.z);
        
        B objB = new B();
        objB.print();
        objB.methodA();
        objB.methodB();
        System.out.println(objB.x);
        System.out.println(objB.y);
        System.out.println(objB.z);


        // B refb = new A(); // Invalid

        A ref= new B();
        ref.methodA();
        // ref.methodB(); - invalid
        ref.print();
        System.out.println(ref.x);
        System.out.println(ref.y);
        // System.out.println(ref.z);

        
    


    }
    
}
