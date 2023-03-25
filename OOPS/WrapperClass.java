/*

wrapper class:


boolean - Boolean
byte - Byte
short - Short
int  - Integer
long - Long
float - Float
double - Double
char - Character


 */


public class WrapperClass {
    
    public static void main(String[] args) {
        
        // Autoboxing 

        int i=45; // primitive
        // Integer j = new Integer(50);
        // Integer j = Integer.valueOf(50); 
        // Integer j = Integer.valueOf(i);
        Integer j=i;

        System.out.println(i);
        System.out.println(j);

        // unboxing

        Integer k = new Integer(3);
        int m = k;
        int n = k.intValue();

        System.out.println(m);
        System.out.println(n);

    }
}
