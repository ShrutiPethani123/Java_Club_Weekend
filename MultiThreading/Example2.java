class Test extends Thread{

    public void run(){
        System.out.println("Task 1 " + Thread.currentThread().getName() );
        Thread.currentThread().setName("t1");
        System.out.println("Task 1  New Name: "  + Thread.currentThread().getName() );
    }
}

class Test2 extends Thread{

    public void run(){
        System.out.println("Task 2 " + Thread.currentThread().getName() );
    }
}

public class Example2 {
    public static void main(String[] args) {
        
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("parshwa");
        System.out.println(Thread.currentThread().getName());

        Test t = new Test();
        t.start();
        System.out.println(t.isAlive());
        System.out.println(Thread.currentThread().getName());

        Test2 t2 = new Test2();
        t2.start();

        System.out.println(t2.isAlive());
    }
}
