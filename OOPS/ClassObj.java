// package OOPS;


/*

oop -> c++ , java
pop ->  c , c++

class
-> virtual entity

object
-> physical entity

 */

class Car{

    int wheel=4;
    String color;

    void displayDetails()
    {
        System.out.println(wheel + " " +color);
    }
}


public class ClassObj {
    
    public static void main(String[] args) {
        
        Car bmw = new Car();
        bmw.color="red";
        bmw.displayDetails();

        Car farari = new Car();
        farari.wheel=5;
        farari.color="white";
        farari.displayDetails();

    }
}
