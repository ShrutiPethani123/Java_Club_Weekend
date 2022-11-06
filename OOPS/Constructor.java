/*
 * 
 constructor :

 -> constructor name is same as class name
 -> constructor do not have return type
 -> use: intialize the value of instance variable
 -> we don't need to call constructor explicitly
 -> whenever object is created constructor automatically called
 
 There are two types of constructor in java
 1. Default - no argument constructor
 2. Perametrized

 */

class Test{

    int a;
    int b;

    Test()
    {
        a=5;
        System.out.println("Constructor called...");
    }

    Test(int x)
    {
        a=x;
        System.out.println("Perametrized constructor..");
    }
    Test(int x, int y)
    {
        a=x;
        b=y;

    }
}


public class Constructor {
    
    public static void main(String[] args) {
        
        Test obj = new Test();
        System.out.println(obj.a);

        Test obj2 = new Test();

        Test obj3 = new Test(3);
        System.out.println(obj3.a);

        Test obj4 = new Test(1,2);
        System.out.println(obj4.a + " "+ obj4.b);

    }
}
