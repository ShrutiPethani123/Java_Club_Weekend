/*

this 

 */

class X{

    int n;
    int m;

    // X(int a,int b)
    // {
    //     n=a;
    //     m=b;
    // }

    X(int n,int m)
    {
        this();
        this.n=n;
        this.m=m;
        System.out.println("Perametrized constructor");
    }

    X()
    {
        // this(2,3);
        System.out.println("Default constructor");
        // this.print();
    }

    void print(){
        
        System.out.println("Hello.....");
        this.sendMsg();
        this.sendMsg();
    }

    void sendMsg()
    {
        System.out.println("Message");
    }


}

class Y extends X{

    Y()
    {
        super(2,3);
        // this();  // invalid
        System.out.println(super.n);
    }

    Y(int c)
    {
        System.out.println("Y class per. constructor");
    }

    

}

public class ThisKeyword {
   
    public static void main(String[] args) {
        
        X obj = new X(3,5);
        System.out.println(obj.n + " "+ obj.m);
        obj.print();
        // obj.sendMsg();

        System.out.println("_________________________________");

        Y obj1 = new Y();

    }
}
