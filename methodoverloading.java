import java.util.*;
class shape
{
  void area(int r)
  {
    System.out.println("the area of circle is "+(3.14*(r^2)));
  }
  void area(int l,int b)
  {
    System.out.println("The area of Rectangle is "+(l*b));
  }
}

class methodoverloading
{
    public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius");
    int r=sc.nextInt();
    System.out.println("enter the length and breadth of rectangle");
    int l=sc.nextInt();
    int b=sc.nextInt();
    shape s=new shape();
    s.area(r);
    s.area(l, b);
   }
}