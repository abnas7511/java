import java.util.*;
class seclarge
{
    public static void main(String[] args) {
        int large=0,seclarge=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
         a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        { 
            if(a[i]>large)
            {
                large=a[i];
            }      
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<large && a[i]>seclarge)
            {
                seclarge=a[i];
            }
        }
        System.out.println("second largest element is "+seclarge);
    }
}
