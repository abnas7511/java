import java.util.*;

import java.util.*;
class fib 
{
 public static void main(String[] args) 
 {
  int a=0,b=1,c=0,x,i;
  Scanner sc =new Scanner(System.in);
  System.out.println("enter limit");
  x=sc.nextInt();
  System.out.println(a);
  System.out.println(b);
  for(i=2;i<=x;i++)
  { 
    c=a+b;
    a=b;
    b=c;
    System.out.println(c);
}    
}
}