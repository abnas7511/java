import java.util.*;
class peri
{
    peri(int r)
    {
        System.out.println("The perimeter of the circle is "+(2*3.14*r));
    }
    peri(int l,int b)
    {
        System.out.println("the perimeter of rectangle is "+(2*(l+b)));
    }
}
class constructoroverloading
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        int r,l,b;
        r=sc.nextInt();
        System.out.println("enter the length and breadth of rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        peri p1=new peri(r);
        peri p2=new peri(l,b);
    }
}