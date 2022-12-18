// package Array;

public class DeleteElementArray {
    
    public static void main(String[] args) {
        
        int a[]={11,22,33,44,55,66,77,88};

        int inx=3;

        for(int i=inx;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }

        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }



    }
}
