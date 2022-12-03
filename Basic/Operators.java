/*

1. Arithmetic operator ( + - * / %)
2. Relational Operator ( < > <= >= == !=)
3. Logical Operator( && || ! )
4. BitWise Operator ( & | ^ << >>)
5. Assignment operator( =  += -= *= /= %=) - shorthand notation
6. Inc/ dec ( ++ --)
7. Ternary operator( ? :)


&&

A   B   A&&B

F   F   F
F   T   F
T   F   F
T   T   T

||

A   B   A||B

F   F   F
F   T   T
T   F   T
T   T   T

^

A   B   A^B

F   F   F
F   T   T
T   F   T
T   T   F

!

 A   !A
 T  F
 F  T


binary(2) --> 0 1
decimal(10) -> 0 to 9

1010 --> 

1*2^3 + 0*2^2 +  1*2^1 + 0*2^0 = 8+0+2+0 = 10

    512    256       128    64    32    16        8    4    2    1

0100 - 4
1111 - 15
0101 - 5
1100 - 12
110 111 - 55
11111 - 31
1011 - 11
1 1100 - 0001 1100 - 28
1111 - 15 
0101 0101 - 85
11 0011 - 51
10 0001 - 33


8 -->  1000
10 --> 1010
12 - 1100
18 - 10010
15 ->  1111
63 ->  11 1111
55 ->  11 0111
45 - >  10 1101





 */

public class Operators {

    public static void main(String[] args) {
        
        int a=3;
        int c=8;
        int b=5;
        System.out.println(a<=b);

        // System.out.println(a>b && b>c); // f && f --> f 
        // System.out.println(a<b || b>c); // t || f --> T
        // System.out.println(!(a<c));

        // int  x=7;
        // // x=x+2;
        // x+=2;
        // System.out.println(x);


        int t = 5; // 0101 -  0000 0101
        int s = 6; // 0110
        //            // 0100 - 4 ( &&)
        //            // 0111 - 7 (|| )
        //            // 0011 - 3 (^)
        // System.out.println(t&s);
        // System.out.println(t|s);
        // System.out.println(t^s);
        System.out.println(t<<1); // 0000 1010 - 10
        System.out.println(t<<2); // 0001 0100 - 20
        System.out.println(t>>1); // 0000 0010 - 2
        System.out.println(t>>3);  // 

        int x = 3;
        // System.out.println(x++);
        // System.out.println(x);
        // System.out.println(++x);
        // System.out.println(x);
        // int y = x++ + x++ + x++ + ++x; //3(4) + 4(5) + 5(6) + 7(7) = 3+4+5+7 = 19
        // int y = ++x + ++x + x++ + ++x + x++ ;
        // int y = x++ + x++; // 3(4) + 4(5) - 3 + 4 = 7
        // int y = ++x + x++; //4(4)+ 4(5)
        // int y=x++ + x++ + ++x; //3(4)+ 4(5)+ 6(6)
        // int y=x++ + ++x + ++x;//3(4)+ 5(5)+ 6(6);
        // System.out.println(y);
        


        // int t=89;
        // int y=78;

        // int min;
        // // if(t<y)
        // // {
        // //     min=t;
        // // }else{
        // //     min=y;
        // // }
        // min = (t<y) ? t :y;
        // System.out.println(min);



    }
    
}
