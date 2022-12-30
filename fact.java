import java.util.*;
class fact
{
     public static void main(String[] args) {
    int x,i,fact=1;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number");
    x=sc.nextInt();
    for(i=1;i<=x;i++)    
     fact=fact*i;
    System.out.println(fact);
    }   
    
}