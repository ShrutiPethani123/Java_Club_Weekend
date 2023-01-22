// package MultiThreading;

class B implements Runnable{

    public void run()
    {
        System.out.println("My Thread B....");
    }
}

public class Test2 {
    
    public static void main(String[] args) {
        
        B obj = new B();
        Thread t = new Thread(obj);
        t.start();

    }
}
