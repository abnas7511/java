import java.util.*;
class employee{
 int a,s;
 String n;
 String m;
 long p;
 Scanner sc=new Scanner (System.in);
 void read()
 {
    System.out.println("enter the name");
    n=sc.nextLine();
    System.out.println("enter employee age");
    a=sc.nextInt();
    System.out.println("enter address");
    m=sc.next();
    System.out.println("enter phone number");
    p=sc.nextLong();
}
void printsalary()
{
    System.out.println("enter the salary");
    s=sc.nextInt();
    System.out.println();
}
void dispalay()
{
    System.out.println("NAME: "+n);
    System.out.println("AGE: "+a);
    System.out.println("ADDRESS: "+m);
    System.out.println("PHONE: "+p);
    System.out.println("SALARY: "+s);
}
}

class officer extends employee
{
    String sp;
    void sread()
    {
        Scanner sc= new Scanner(System.in);
        super.read();
        System.out.println("Area of specialization");
        sp=sc.nextLine();
    }
    void sprint()
    {
        super.dispalay();
        System.out.println("SPECIALIZATION: "+sp);
        System.out.println();
    }
}
class manager extends employee
{
    String dp;
    void sread()
    {
     Scanner sc =new Scanner(System.in);
     super.read();
     System.out.println("enter the department");
     dp=sc.nextLine();
    }
    void sprint()
    {
        super.dispalay();
        System.out.println("DEPARTMENT: "+dp);
        System.out.println();
    }
}
class inheritance
{
    public static void main(String[] args) {
        officer o=new officer();
        manager m=new manager();
        System.out.println("officer:");
        o.sread();
        o.printsalary();
        System.out.println("Manager");
        m.sread();
        m.printsalary();
        System.out.println("officer:");
        o.sprint();
        System.out.println("manager:");
        m.sprint();

    }
}
