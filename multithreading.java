import java.lang.*;
class odd extends Thread
{
    public void run()
    {
     for(int i=1;i<100;i=i+2)
      System.out.println(i+"");
     System.out.println("Printed odd numbers till 100");
    }
}
class even extends Thread
{
    public void run()
    {
       for(int i=2;i<100;i=i+2)
        System.out.println(i+"");
       System.out.println("Printed even numbers till 100");
    }
}
class test
{
    public static void main(String[] args)throws InterruptedException {
        odd o=new odd();
        even e=new even();
        o.start();
        o.join();
        e.start();
    }
}