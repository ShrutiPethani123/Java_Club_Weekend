/*
 

byte -> nextByte(); 
short -> nextShort();
int -> nextInt();
float -> nextFloat();
double -> nextDouble();
boolean -> nextBoolean();
char -> 


 */

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // System.out.println("value is: "+ a);

        // sc.nextLine();
        // System.out.println("Enter string: ");
        // String str = sc.nextLine();
        // System.out.println(str);

        char ch;
        ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}
