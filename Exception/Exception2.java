/*
Multiple Catch block

 */

import java.util.Scanner;
public class Exception2 {

    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            int ans=a/b;
            System.out.println("Answer is "+ ans);
        }catch(NullPointerException e)
        {
            System.out.println("Null Poiner Exception");
        }
       
        //catch(ArithmeticException e)
        // {
        //     System.out.println("can't divide by 0");
        // }
        catch(Exception e)
        {
            // System.out.println("All Exception Catched here");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("Good Bye!!!");
    
    }
}
