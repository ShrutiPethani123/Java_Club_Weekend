class Test
{
    void print1() throws Exception
    {
        print2();
        System.out.println("Print 1");
    }

    void print2() throws Exception
    {
        print3();
        System.out.println("Print 2");
    }

    void print3() throws Exception
    {
        System.out.println("Print 3");
        throw new Exception();
        // throw new RuntimeException();
    }
}

public class Exception5 {
    public static void main(String[] args) {
        
        Test t = new Test();

        try{
            t.print1();
        }catch(Exception e)
        {
            System.out.println("All exception Handled");
        }
    }
}
