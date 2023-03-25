class T1 extends Thread{
    
    // public void run()
    // {
    //     System.out.println("T1: " + Thread.currentThread().getName());
    // }

    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Deamon Thread: "+Thread.currentThread().getName());
        }else{
            System.out.println("Normal Thread: " + Thread.currentThread().getName());
        }
    }
}

public class Example3 {
    public static void main(String[] args) {
        
        // System.out.println("Current Thread: "+ Thread.currentThread().getName());
        // T1 t = new T1();
       
        // t.setDaemon(true);
        // t.start();
        // System.out.println(t.isDaemon());

        T1 t = new T1();
        T1 t1 = new T1();
        T1 t2 = new T1();

        t.setDaemon(true);
        t.start();
        t1.start();
        t2.start();

    }
}
