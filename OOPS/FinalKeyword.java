/*

final - constant
final - class , Method , Variable

-> we can't inherite final class.
-> we can't change the value of final variable.
-> we can't override final Method.

 */
class X{

    // final int x=50;
    // final int y;

    // X(int z){
    //     y=z;
        
    // }
    int z;

    final void display()
    {
        System.out.println("Hello");
    }
    
    

}

class Y extends X{

//    final void display()
//     {
//         System.out.println("Hello");
//     }
    

}

public class FinalKeyword {
    public static void main(String[] args) {


    }
}
