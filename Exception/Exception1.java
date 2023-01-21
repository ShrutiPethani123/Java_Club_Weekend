/*
 
        Object
          |
        Throwable
        /      \
      Exception  Error 
      
      1. RunTimeException
            1. Arithmetic Exception
            2. Null Pointer
            3. ClassNotFound
            4. IndexOutOfBound
                1.ArrayIndexOutOfBound
                2.StringOutOfBound

      2. IO Exception
            1. EOF Exceptoion
            2. FileNotFound Exception
            3. Interupted Exception
      

Exception

--> 

type:
1. checked Exception  -> check compile time  (IO excption)
    1. fully checked  - IO Exception
    2. Partially checked - Exception
2. unchecked Exception -> not check at compile time (Runtime)

try
catch
finally
throw
throws
printStackTrace()


 */
import java.util.Scanner;

class TierPuncherException extends Exception{

        TierPuncherException()
        {
            System.out.println("Tier puncher Exception called...");
        }
}

public class Exception1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number:");
        int a= sc.nextInt();
        int b= sc.nextInt();

        // System.out.println(a/b);
        try{
            System.out.println(a/b);
            // return;
            // System.exit(0);
            throw new TierPuncherException();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        }
        catch(NullPointerException e)
        {
            // e.printStackTrace();
            System.out.println("Null pointer exception Handled");
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Handled");
        }catch(TierPuncherException t)
        {
            // t.printStackTrace();
            System.out.println("Tier puncher Exception handled");
        }
        catch(Exception e)
        {
            System.out.println("Handeled all Exception...");
        }
        finally{
            System.out.println("Finally");
        }

        System.out.println("done!!");
    }
    
}
