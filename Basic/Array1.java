import java.util.Scanner;

/*


    1 3 5 6 7 

    -> continuos memory location
    -> index start with 0
    -> index end with length-1
    -> all elemnets have same data types

 */

public class Array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        // int b[]={11,82,13,34,45};

        // System.out.println(b[5]);

        // for(int i=0;i<b.length;i++)
        // {
        //     b[i]=b[i]+2;
        //     System.out.print(b[i]+ " ");
        // }
        // System.out.println();
        // for(int x: b)
        // {
        //     System.out.print(x+ " ");
        // }

        for(int i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]= ");
            a[i]=sc.nextInt();
        }

        System.out.println("Array is:");
        for(int y:a)
        {
            System.out.print(y+ " ");
        }

        int evenCount=0;

            // 1 3 5 6 2 4 
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evenCount++;
            }
        }

        System.out.println();
        System.out.println("Total even numbers: " + evenCount);




    }
}

/*
 
1. take all elements from user of array and count all even numbers.
2. take all elements from user of array and print all neagative elements of array.
3. take all elements from user and search element from array.
    
    2 3 4 5 6 78 

    user - 5
    if element present --> found at 4 position
    
    if element not present --> not found!!
    
4. find maximum element from array.
5. reverse the array in Memory.
    1 4 2 3 --> 3 2 4 1

 */