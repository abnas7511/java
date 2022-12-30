import java.util.*;
class replace
{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
         a[i]=sc.nextInt();
        System.out.println("enter element to be repalced");
        int x=sc.nextInt();
        System.out.println("enter element to replace");
        int y=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                a[i]=y;
            }
        }
        for(i=0;i<n;i++)
         System.out.println(a[i]);
    }
}