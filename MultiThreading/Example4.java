class Test extends Thread{

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                Thread.sleep(5000); // ms
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
            
        }
    }
}


public class Example4 {
   public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.start();
        t2.start();
        t3.start();
   }
}
