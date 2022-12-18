// package Array;

import java.util.Scanner;
public class InsertElem {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size for array:");
        int n=sc.nextInt();
        int a[]=new int[n+1];
        
        for(int i=0;i<a.length-1;i++)
        {
                a[i]=sc.nextInt();
        }

        for(int y:a)
        {
            System.out.print(y+" ");
        }

        int inx=3;
        int elm=100;

        for(int i=n-1;i>=inx;i--)
        {
            a[i+1]=a[i];
        }
        a[inx]=elm;

        System.out.println();
        for(int x:a)
        {
            System.out.print(x+" ");
        }

    }
}
