import java.util.Scanner;

/*


array -> data structure

1 3 4 6 3 

-> all elements have same data types
-> all elements have continous memory location
-> index start with 0
-> index end with length-1

 */


public class Array2 {

    public static void main(String[] args) {
        
      
        // int b[]={22,33,4,5,67};

        // for(int i=0;i<b.length;i++)
        // {
        //     System.out.print(b[i]+" ");
        // }
        // System.out.println();
        // System.out.println(b[-5]);

        int a[]=new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array is..");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        // for(int x:a)
        // {
        //     System.out.print(x+ " ");
        // }

    }
    
}
