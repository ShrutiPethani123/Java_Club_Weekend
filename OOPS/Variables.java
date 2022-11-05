// package OOPS;

/*
 
3 types of variable

1. instance
2. local
3. static

-> instance variable have default value

boolean - false
byte - 0
short - 0
int - 0
long - 0
float - 0.0
double - 0.0
String - null
char - '\0'

 */

class A{

    int x=30; // instance
    char c;

    void print()
    {
        int y=3; // local
        x=x+y;
        System.out.println(x);
    }

}


public class Variables {

    
    public static void main(String[] args) {
        
        int y;
        A obj=new A();
        System.out.println(obj.x);
        // System.out.println(obj.c);
        obj.print();
        System.out.println(obj.x);
        System.out.println(y);
    }
    
}
