class Test extends Thread{

    public void run()
    {
        System.out.println("Task 1");
    }
}

class Test1 extends Thread{
    public void run()
    {
        System.out.println("Task 2");
    }
} 

public class Example1 {
    public static void main(String[] args) {
        
        Test t = new Test();
        t.start();
        Test1 t2 = new Test1();
        t2.start();
    }
}
