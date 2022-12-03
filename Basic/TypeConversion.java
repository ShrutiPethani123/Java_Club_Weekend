/*

    boolean --> true false
    byte
    short
    int
    long
    float
    double
    char
    String

    1. implicit type conversion 

        byte-> short -> int -> long -> float -> double

    2. Explicit type conversion 

        double-> float-> long -> int -> short -> byte

 */

public class TypeConversion {
    
    public static void main(String[] args) {
        
        int a=5;
        long l = a;
        System.out.println(l);

        long x=44;
        int y = (int)x;
        System.out.println(y);

        float f=34.67f;
        int i =(int)f;
        System.out.println(i);

        // boolean b =true;
        // short s= b;
        

    }
}
