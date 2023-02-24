import java.io.*;
import java.util.Scanner;
class Arexception
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("D=A/(B-C)");
        System.out.println("Enter three numbers(A,B,C)");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        try
        {
            int d=a/(b-c);
            System.out.println("D= "+a+"/("+b+"-"+c+")="+d);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
    }
}