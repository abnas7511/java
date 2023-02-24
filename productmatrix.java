import java.util.*;
class productmatrix
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order of first matrix");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the order of second matrix");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e[][]=new int[a][b];
        int f[][]=new int[c][d];
        if(b==c)
        {   
            System.out.println("enter the elements of first matrix");
            for(int i=0;i<a;i++)
            {
               for(int j=0;j<b;j++)
               {
                 e[i][j]=sc.nextInt();
               }
            }
            System.out.println("enter the elements of second matrix");
            for(int i=0;i<c;i++)
            {
               for(int j=0;j<d;j++)
               {
                f[i][j]=sc.nextInt();
               }
            }
            System.out.println();
            for(int i=0;i<a;i++)
            {
               System.out.println();
               for(int j=0;j<b;j++)
               {
                System.out.println(e[i][j]+"\t");
                System.out.println(" ");
               }
            }
            System.out.println();
            for(int i=0;i<c;i++)
            {
               System.out.println();
               for(int j=0;j<d;j++)
               {
                System.out.println(f[i][j]+"\t");
               }
               System.out.println(" ");
            }
            int g[][]=new int[a][d];
            for(int i=0;i<a;i++)
            {
               for(int j=0;j<d;j++)
               {
                for(int k=0;k<b;k++)
                {
                    g[i][j]+=e[i][k]*f[k][j];
                }
               }
            }
            System.out.println();
            System.out.println("the product of matrix is :");
            for(int i=0;i<a;i++)
            {  
               for(int j=0;j<d;j++)
               {
                System.out.println(g[i][j]+"\t");
                System.out.println(" ");
               }
            }

        }
        else
        {
            System.out.println("mulltiplication not possible");
        }
       
    }
}
