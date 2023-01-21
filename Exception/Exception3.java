

// finally block

public class Exception3 {
    public static void main(String[] args) {
        
        int ans=0;
        try{
            ans = 2/2;
           
        }
        catch(Exception e)
        {
           System.out.println(ans);
           e.printStackTrace();
        }
        finally{
            System.out.println("byeeeeeeeeeeeeeeeeee.........");
        }
    }
}
