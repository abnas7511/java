import java.util.*;
class Employee
{
    void display()
    {
        System.out.println("Name of class is employee");
    }
    void calcsal()
    {
      System.out.println("salary=10000");
    }
}
class engineer extends Employee
{
    void display()
    {
        System.out.println("Name of class is engineer");
    }
    void calcsal()
    {
        System.out.println("salary =50000");
        super.display();
        super.calcsal();

    }
}
class Super{
    public static void main(String[] args) {
        engineer e=new engineer();
        e.display();
        e.calcsal();
    }
}