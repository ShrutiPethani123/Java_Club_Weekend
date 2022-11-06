import java.util.Scanner;
class Shape{

    int l,w;

    Scanner sc = new Scanner(System.in);
    void setData()
    {
        System.out.println("Enter values :");
        l=sc.nextInt();
        w=sc.nextInt();
    }

    

}
class Rect extends Shape{

    void area()
    {
        System.out.println("Area of rectangle is "+(l*w) );
    }

    

}

public class FindArea {
    public static void main(String[] args) {
        
        Rect obj = new Rect();
        obj.setData();
        obj.area();

    }
}
