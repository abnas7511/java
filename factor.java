import java.util.*;
class factor 
{
 public static void main(String[] args) 
 {
  int x,i;
  Scanner sc =new Scanner(System.in);
  System.out.println("enter number");
  x=sc.nextInt();
  System.out.println("the factors are");
  for(i=1;i<=x;i++)
   {
    if(x%i==0)
    {
     System.out.println(i);
    }
   }
 }   
}
