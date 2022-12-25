import java.util.Scanner;
import java.util.Random;
class Employee {

    Scanner sc = new Scanner(System.in);
    int eid;
    int age;
    String name;
    String department;
    String position;

    void getData() {
        Random r = new Random();
        // System.out.println("Enter Id: ");
        eid = r.nextInt(50);
        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter department:");
        department = sc.nextLine();
        System.out.println("Enter Position: ");
        position = sc.nextLine();
    }

    void printData() {
        System.out.println("-------------------------------------------");
        System.out.println("id: " + eid);
        System.out.println("age: " + age);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
        System.out.println("Position: " + position);
        System.out.println("-------------------------------------------");
    }
}

public class ArrayObj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Employee e[] = new Employee[100];
        int count=0;

        while (true) {
            System.out.println("__________________________");
            System.out.println("0.Exit");
            System.out.println("1.Add Employee");
            System.out.println("2.Display Details");
            System.out.println("3.Display Particular");
            System.out.println("4.Update the Deatails");
            System.out.println("__________________________");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            

            switch (choice) {
             case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter Details of " + (count + 1) + " Employee");
                    e[count]=new Employee();
                    e[count].getData();
                    count++;
                    System.out.println("Count: "+count);
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {

                        e[i].printData();
                    }
                    break;
                case 3:
                    int id,flag=0;
                    System.out.println("Enter Id of Employee");
                    id=sc.nextInt();

                    for(int i=0;i<count;i++)
                    {
                        if(e[i].eid ==id)
                        {
                            e[i].printData();
                            flag=1;
                            break;
                        }
                    }

                    if(flag==0)
                    {
                        System.out.println("Incorrect ID...");
                    }
                    
                    break;
                
                case 4:
                        break;
                default:
                    System.out.println("Invalid choice!!");

            }

        }

    }
}

/*
 * 
 * -> Take one array from user and delete one element from Array.
 * 
 * 4 5 9 63 1 5
 * 
 * -> indx: 2 -> remove element from 2nd index
 * 
 * -> output: 4 5 63 1 5
 * 
 * 
 * -> take one array from user and insert element of user given position
 * 
 * 1 5 6 9 3 1 4
 * 
 * elem - 89
 * inx - 2
 * 
 * 1 5 89 6 9 3 1 4
 * 
 * 
 * 
 */