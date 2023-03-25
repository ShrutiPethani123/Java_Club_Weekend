import java.util.ArrayList;

class Student{

    int rollno;
    int age;
    String name;
    String addreess;

    Student(int rollno, int age, String name, String addreess)
    {
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.addreess=addreess;
    }

}

public class StudentList {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student(1,21,"raj","Ahmedabad");
        Student s2 = new Student(2,22,"jiya","Baroda");
        Student s3 = new Student(3,21,"joy","Anand");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for(Student s : students)
        {
            System.out.println(s.rollno + " " + s.name + " " + s.age + " " + s.addreess);
        }


    }
}

/*


switch case:

1. Add student
2. display
3. search student (rollno)
4. delete student (rollno)


 */
