import java.util.*;
class Employee{

    int id;
    String name;
    String address;
    long salary;
    String designation;

    Employee(int id,String name,String address , long salary,String designation)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.designation=designation;
    }
}



public class EmployeeDetails {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        String address;
        long salary;
        String designation;
        // System.out.println("Enter id: ");
        // id=sc.nextInt();
        // System.out.println("Enter name: ");
        // sc.nextLine();
        // name=sc.nextLine();
        // System.out.println("Enter address: ");
        // address=sc.nextLine();
        // System.out.println("Enter salary: ");
        // salary=sc.nextLong();
        // sc.nextLine();
        // System.out.println("Enter designation: ");
        // designation=sc.nextLine();


        // Employee e1 = new Employee(id, name, address, salary, designation);

        LinkedList<Employee>emp = new LinkedList<>();

        for(int i=0;i<2;i++)
        {
            System.out.println("Enter id: ");
            id=sc.nextInt();
            System.out.println("Enter name: ");
            sc.nextLine();
            name=sc.nextLine();
            System.out.println("Enter address: ");
            address=sc.nextLine();
            System.out.println("Enter salary: ");
            salary=sc.nextLong();
            sc.nextLine();
            System.out.println("Enter designation: ");
            designation=sc.nextLine();

            Employee e1 = new Employee(id, name, address, salary, designation);
            emp.add(e1);
            
        }

        

        for(Employee e: emp)
        {
            System.out.println(e.id+ " " + e.name + " " + e.address + " " + e.salary + " " + e.designation);
        }


    }   
}



