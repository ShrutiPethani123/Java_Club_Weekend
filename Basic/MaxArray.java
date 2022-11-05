import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];

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

        int max=a[0];
        // 2 3 5 6 
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }

        }
        System.out.println("maximum element is "+ max);

    }
}
