/*

Inheritance:

use: code Reusability

A ( parent , super , base)
|
B (Child , sub , Derived)

Total 5 types of inheritance

1. single
2. Multi level
3. Multiple - not supported in java
4. Hyrarchical
5. Hybrid

1.single

    A
    |
    B

2. Multi level

    A
    |
    B
    |
    C
    

3. Multiple

    A   B
    \   /
      C

    - Ambiguity problem
    
4. Hyrarchical 

     A
    /  \
    B  C

5. Hybrid

     A
     |
     B
    / \
    C D

    A
    |
    B - D
    |
    C
    |
    E



 */

class Animal{

    int leg=4;

    void run()
    {
        System.out.println("Running...");
    }

}

class Dog extends Animal{

    void bark()
    {
        System.out.println("Barking...");
    }
}


public class Inheritance {
    
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.run();
        d.bark();

        Animal a = new Animal();
        a.run();
        // a.bark();

    }
}


/*
 
    Shape - class
    Rect - class

    shape  - take values from user
    rect - void area()


 */