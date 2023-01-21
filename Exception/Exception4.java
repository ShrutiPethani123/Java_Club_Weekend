public class Exception4 {
    public static void main(String[] args) {
        
        int a=45;
        int b=0;
        try{
            
            if(b==0)
            {
                throw new ArithmeticException();
            }else{
                int c=a/b;
                System.out.println(c);
            }
           

        }catch(ArithmeticException e)
        {
            System.out.println("handled");
        }
    }
}
