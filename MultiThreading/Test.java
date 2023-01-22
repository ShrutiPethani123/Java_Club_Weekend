class A extends Thread{

    public void run()
    {
        System.out.println("My Thread123...");
    }
}


public class Test {
    
    public static void main(String[] args) {
        
        A t = new A();
        t.start();
        // t.start(); - invalid
    }
}
