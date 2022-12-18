import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Employee{

    Scanner sc=new Scanner(System.in);
    int eid;
    int age;
    String name;
    String department;
    String position;

    void getData()
    {
        System.out.println("Enter Id: ");
        eid=sc.nextInt();
        System.out.println("Enter age: ");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter department:");
        department=sc.nextLine();
        System.out.println("Enter Position: ");
        position=sc.nextLine();
    }

    void printData()
    {
        System.out.println("-------------------------------------------");
        System.out.println("id: "+eid);
        System.out.println("age: "+age);
        System.out.println("name: "+name);
        System.out.println("department: "+department);
        System.out.println("Position: "+ position);
        System.out.println("-------------------------------------------");
    }
}

public class ArrayObj {
    public static void main(String[] args) {
        
        // Employee e=new Employee();
        // e.getData();
        
        // Employee e1=new Employee();
        // e1.getData();
        
        // Employee e2=new Employee();
        // e2.getData();

        // e.printData();
        // e1.printData();
        // e2.printData();

        // int a[]=new int[5];

        Employee e[]=new Employee[2];

       for(int i=0;i<e.length;i++)
       {
            e[i]=new Employee();
            System.out.println("Enter Details of "+ (i+1) +"Employee");
            e[i].getData();
       }

       for(int i=0;i<e.length;i++)
       {
            e[i].printData();
       }



    }
}

/*

    -> Take one array from user and delete one element from Array.

        4 5 9 63 1 5

       -> indx: 2 -> remove element from 2nd index
 
       -> output:  4 5 63 1 5


    -> take one array from user and insert element of user given position

    1 5 6 9 3 1 4

    elem - 89
    inx - 2

    1 5 89 6 9 3 1 4



 */