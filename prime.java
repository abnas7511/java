import java.util.*;
class prime {
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     int x,i,flag=0;
     System.out.println("enter the no to be checked");
     x=sc.nextInt();
     for(i=2;i<x/2;i++)
    { if(x%i==0)
       {
        flag=1;
        break;
       }   
    }
    if(flag==1)
      System.out.println("not prime");
    else
      System.out.println("prime"); 
}
}
