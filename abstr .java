import java.util.*;
abstract class shape
{
    abstract void Noofsides();
}
class rectangle extends shape
{
    void Noofsides()
    {
        System.out.println("The no of sides of rectangle is 4");
    }
}
class triangle extends shape
{
  void Noofsides()
  {
     System.out.println("no of sides of triangle is 3");
    }
}

class Test
{
    public static void main(String[] args) {
        shape s=new rectangle();
        shape t=new triangle();
        s.Noofsides();
        t.Noofsides();
    }
}