import java.util.*;
class larmat
{
      public static void main(String[] args) {
        int i,j,m,n,large;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and coloums");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
        large=a[0][0];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
              if(a[i][j]>large)
              {
                large=a[i][j];
              }
            }
        }
        System.out.println("largest element in the "+m+"*"+n+" matrix is "+large);
    }
}