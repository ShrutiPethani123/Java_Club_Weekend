/*


Exception -> 

try
catch

            Object
               |
            Throwable
                |
            -----------
            |          |

            Exception   Error

            1. RuntimeException
                1. ArithmeticException
                2. NullPointerException
                3. IndexOutOfBoundException
                    1. ArrayIndexOutOfBoundException
                    2. StringIndexOutOfBoundException
                4.ClassCastException
                5.NumberFormatException
                .
                .
                .

            2. IOException
                1. EOFException
                2. FileNotFoundException
                3. InterruptedException

            3. SQLException
            .
            ?.
            .


-> Types of Exception

1. checked Exception - checked by compiler
    1. Fully checked Exception
        -> all child of that class also checked exception
            exa: 
                IOException
    2. Partially checked Exception
            exa:
                Exception
                Throwable

2. unchecked Exception - not checked by compiler 

-> checked Exception
        
    1. EOFException
    2. FileNotFoundException
    3. InterruptedException




 */

import java.util.Scanner;
public class ExceptionExa {

    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        // int ans=a/b;
        // System.out.println(ans);
        try{
            int ans=a/b;
            System.out.println("Answer is "+ ans);
        }catch(Throwable e)
        {
            System.out.println("can't divide by 0");
        }
        System.out.println("------------------");
    }
    
}
