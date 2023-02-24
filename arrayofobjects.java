import java.util.*;
class employee
{
    int x;
    String n;
    long p;
    void read()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of employee:");
        n=sc.nextLine();
        System.out.println("enter the employee number:");
        x=sc.nextInt();
        System.out.println("enter the phone number:");
        p=sc.nextLong();
    }
    void display()
    {
        System.out.println("Name: "+n);
        System.out.println("Emp No: "+x);
        System.out.println("Phone: "+p);
    }
}
class arrayofobjects
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of employee details");
        int y=sc.nextInt();
        employee obj[]=new employee[y];
        for(int i=0;i<y;i++)
        {
            obj[i]=new employee();
            obj[i].read();
        }
        for(int i=0;i<y;i++)
        {
            obj[i].display();
        }
    }
}