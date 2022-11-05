import java.util.Scanner;
public class HCF {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int hcf=0;
        int lcm;

        // int min = a>b ?b:a;

        // for(int i=1;i<=min;i++)
        // {
        //     if(a%i==0 && b%i==0)
        //     {
        //         hcf=i;
        //     }
        // }


        int max=a>b?a:b;

        int i=max;
        while(true)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
            i+=max;
        }

        System.out.println("lcm of "+ a + " and " + b + " is " + lcm);

    }
}
