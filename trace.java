import java.util.*;
class test
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("enter the elements");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum=sum+a[i][i];
            }
        }
        System.out.println("trace of the matrix is:");
        System.out.println(sum);
    }
}