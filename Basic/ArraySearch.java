import java.util.Scanner;
public class ArraySearch {
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

        System.out.println("Enter the element do you want to search? ");
        int n = sc.nextInt();

        boolean check=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println(n + " is present at location "+ (i+1));
                check=true;
                break;
            }
            
        }

        if(check==false)
        {
            System.out.println("not found!!");
        }
    }
}
