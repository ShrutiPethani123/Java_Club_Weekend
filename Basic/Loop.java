/*

1. Entry control 

    1. for
    2. while

2. Exit control

    1. do while


for loop

for(init;con;inc/dec)
{
    // body 
}

while loop

ini
while(con)
{
    // body
    inc/dec
}

 */


public class Loop {
    public static void main(String[] args) {
        
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(i);
        // }

        // int i=1;
        // while(i<=10)
        // {
        //     System.out.println(i);
        //     ++i;
        // }

        // int i=21;
        // do{

        //     System.out.println(i);
        //     i+=2;
        // }while(i<=30);

        int n=1234;
        int count=0;
        while(n!=0)
        {
            n=n/10; // 123  // 12
            count++; // 1 // 2
        }
        System.out.println(count);
    }
}

/*

1. print reverse number from 1 to 10 using all loops.
2. print all even numbers between 20 to 30 using do while loop.
3.print all even numbers between 20 to 30 using do while loop whithout if.
4. print multiplication table using while loop.

    4 * 1 = 4
    4 * 2 = 8
    .
    .
    .
    4 * 10 = 40

5. take one number from user and count number of digit. ( 32345 - 5)
6. take one number from user and print sum of digit. ( 1234 - 10)
7. take one number from user and print reverse of number.( 5643 --> 3465)
8. check number is palindronm or not. ( 1221 )
9. find hcf of two numbers ( 12 , 6 --> 6)

    12 --> 1 2 3 4 6 12
    6 --> 1 2 3 6


    36 --> 1 2 3 4 6 9 12 18 36
    6--> 1 2 3 6 

10. find lcm of two numbers

    12 - 12 24 36 ...
    6 - 6 12 18 24 30 36...







    


 */
