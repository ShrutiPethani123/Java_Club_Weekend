public class ArrayRev {
    public static void main(String[] args) {
        
        int a[]={3,2,4,5,7};

        // int b[]=new int[a.length];

        // int j=0;
        // for(int i=a.length-1;i>=0;i--)
        // {
        //     b[j]=a[i]; // b[0]=a[4]   b[1]=a[3]
        //     j++;
            
        // }

        int x=0;
        int y=a.length-1;

        while(x<=y)
        {
            int t=a[x];
            a[x]=a[y];
            a[y]=t; 
            x++;
            y--;
        }



        // for(int x:b)
        // {
        //     System.out.print(x + " ");
        // }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
