/*
 
A
|
B
|
C

 */
class A{

    void methodA()
    {
        System.out.println("Class A");
    }

}

class B extends A{

    void methodB()
    {
        System.out.println("class B");
    }


}

class C extends B{

    void methodC()
    {
        System.out.println("class C");
    }

}



public class MultiLevelInh {
    public static void main(String[] args) {

        C cobj = new C();
        cobj.methodA();
        cobj.methodB();
        cobj.methodC();

        B bobj = new B();
        bobj.methodA();
        bobj.methodB();
        // bobj.methodC();

        A aobj = new A();
        aobj.methodA();
        // aobj.methodB();
        // aobj.methodC();




    }
}
