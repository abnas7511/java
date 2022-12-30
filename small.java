import java.util.*;
class small
{
    public static void main(String[] args) {
        int small,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
         a[i]=sc.nextInt();
        small=a[0];
        for(i=0;i<n;i++)
        { 
            if(a[i]<small)
            {
                small=a[i];
            }      
        }
        System.out.println("smallest element is "+small);
    }
}
