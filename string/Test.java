// package string;


/*

    String - it is a sequence of character.

    class - String
    userInput-  next() , nextLine()

    declare:
    1. using literals --> String str = "java"
    2. using object --> String str = new String("java")


 */

import java.util.Scanner; 
import java.lang.String;
public class Test {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String str = sc.nextLine();
        // System.out.println("Your name is: " + str);

        // String s = "jaVa";
        String s = new String("jaVa");
        System.out.println(s);

        System.out.println("Length of string: " + s.length());

        // array - length (a.length) 
        // string - length(s.length())

        // string objects are immutable.

        System.out.println(s.toLowerCase());
        // s=s.toLowerCase();
        s="Hello World";
        // 012345678910
        System.out.println(s.toUpperCase());
        System.out.println("character at 3rd index: " + s.charAt(3));
        // char input: sc.next().charAt(0);
        System.out.println(s.contains("world"));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,7));  // 2 to 6
        System.out.println(s.equals("Hello"));
        System.out.println(s.equals("Hello World"));
        String s1 = "Hello world";
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.equalsIgnoreCase("world"));
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("rld"));
        System.out.println(s.indexOf('t'));
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('o',5));
        System.out.println(s.startsWith("H"));
        System.out.println(s.startsWith("k"));
        System.out.println(s.startsWith("e", 1));
        System.out.println(s.startsWith("ello", 1));
        System.out.println(s.endsWith("d"));
        System.out.println(s.endsWith("rld"));
        System.out.println(s.endsWith("Hello World"));

        String s3 = "    xyz       ";
        System.out.println(s3);
        System.out.println(s3.trim());

        String s4 = "   x        yz";
        System.out.println(s4);
        System.out.println(s4.trim());

        String s5 = "java";
        String s6 = "python";

        System.out.println(s5+s6);
        System.out.println(s5.concat(s6));

        int a =5;
        int b=6;
        System.out.println(a+b);
        System.out.println(a+b + " Addition is: "+ a + b);
        System.out.println(s5.replace('a', 'z'));

        String s7 = "India is Best Country India Country";
        System.out.println(s7.replaceFirst("o", "a"));
        System.out.println(s7.replace('t', 'a'));
        System.out.println(s7.replace("India", "ABC"));



        //1. Take one string from user check string is palindrom or not.
        //2. Take two sting from user and check first string is substring of second string or not. 

            // good
            // goodmorning


        




    }

}
