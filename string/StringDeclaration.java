import java.rmi.server.SocketSecurityException;

public class StringDeclaration {
    public static void main(String[] args) {
        // String name ="raj"; // using literal
        // String city=new String("Ahmedabad"); // using new keyword

        // System.out.println(name);
        // System.out.println(city);

        // city.concat("Gandhinagar");
        // System.out.println(city); // immutable

        // StringBuffer sb = new StringBuffer("Joy");
        // System.out.println(sb);
        // sb.append("roy");
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("Joy");
        System.out.println(sb);
        sb.append("roy");
        System.out.println(sb);
    }
}

/*
 
               String      StringBuffer    StringBuilder

storage:       Heap,scp         Heap           Heap 
objects:       immutable       mutable         mutable 
Memory:        more            less compare    less compare to string
                               to string 
ThreadSafe:     No              yes            No








 */