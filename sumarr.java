import java.util.*;
class sumarr
{
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
          a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        sum=sum+a[i];
        System.out.println("sum is "+sum);   
    }
}
