abstract class RBI{
    int x=67;

    void rateOfInterest()
    {
        System.out.println();
    }

    abstract  void rule();

}

abstract class GOV extends RBI{

}

class BOB extends GOV{

    public void rule()
    {
        System.out.println("Follow rules");
    }
}


public class Bank {
    public static void main(String[] args) {

        RBI obj = new RBI();
        obj.x=4000;
        System.out.println(obj.x);
        
    }
}

/*

Access Modifier

private < default < Protected <public

 */