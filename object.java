import  java.util.*;
class student
{
    Scanner sc=new Scanner(System.in);
    String name;
    int rollno;
    int a[]=new int[5];

    void read()
    {
        System.out.print("enter the name");
        name=sc.nextLine();
        System.out.println("enter the roll no");
        rollno=sc.nextInt();
        System.out.println("enter the marks");
        for(int i=0;i<5;i++)
         a[i]=sc.nextInt();
    }
    void Display()
    {
        System.out.println("NAME: "+name);
        System.out.println("ROLLNO: "+rollno);
        System.out.println("MARKS:");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}

class object
{
    public static void main(String[] args) {
        student s=new student();
        s.read();
        s.Display();
    }
}
