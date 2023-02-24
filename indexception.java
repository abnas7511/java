import java.util.*;
class indexception
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int s=sc.nextInt();
        System.out.println("enter elements");
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
         a[i]=sc.nextInt();
        }
        System.out.println("enter the pos of no to be printed");
        int k=sc.nextInt();
        try
        {
            System.out.println("the number is "+a[k-1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error");
        }
    }
}