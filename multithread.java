import java.lang.*;
class odd extends Thread
{
    public void run()
    {
       for(int i=1;i<100;i=i+2)
        {
            System.out.println(i+" ");
        }
        System.out.println("printed odd numbers till 100");
    }
}
class even extends Thread
{
    public void run()
    {
        for(int i=0;i<=100;i=i+2)
        {
            System.out.println(i+" ");
        }
        System.out.println("printed even numbers till 100");
    }
}
class multithread
{
    public static void main(String[] args)throws InterruptedException 
    {
       odd o=new odd();
       even e= new even();
       o.start();
       o.join();
       e.start();
    }
    

}